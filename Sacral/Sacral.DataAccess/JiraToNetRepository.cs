namespace Sacral
{
    public class JiraToNetRepository : IJiraToNetRepository
    {
        private readonly IMongoDatabase _db;

        public JiraToNetRepository(IMongoDatabase db)
        {
            _db = db;
        }

        public async Task<JiraToNetModel> GetByIdAsync(int id)
        {
            var collection = _db.GetCollection<JiraToNetModel>("JiraToNet");
            var filter = Builders<JiraToNetModel>.Filter.Eq(x => x.Id, id);
            var result = await collection.Find(filter).FirstOrDefaultAsync();

            return result;
        }

        public async Task<IEnumerable<JiraToNetModel>> GetAllAsync()
        {
            var collection = _db.GetCollection<JiraToNetModel>("JiraToNet");
            var result = await collection.Find(_ => true).ToListAsync();

            return result;
        }

        public async Task<JiraToNetModel> CreateAsync(JiraToNetModel model)
        {
            var collection = _db.GetCollection<JiraToNetModel>("JiraToNet");
            await collection.InsertOneAsync(model);

            return model;
        }

        public async Task<JiraToNetModel> UpdateAsync(JiraToNetModel model)
        {
            var collection = _db.GetCollection<JiraToNetModel>("JiraToNet");
            var filter = Builders<JiraToNetModel>.Filter.Eq(x => x.Id, model.Id);
            await collection.ReplaceOneAsync(filter, model);

            return model;
        }

        public async Task DeleteAsync(int id)
        {
            var collection = _db.GetCollection<JiraToNetModel>("JiraToNet");
            var filter = Builders<JiraToNetModel>.Filter.Eq(x => x.Id, id);
            await collection.DeleteOneAsync(filter);
        }
    }
}