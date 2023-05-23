namespace Sacral
{
    public class ConfigureGitHubRepository : IConfigureGitHubRepository
    {
        private IMongoDatabase _db;

        public ConfigureGitHubRepository(IMongoDatabase db)
        {
            _db = db;
        }

        public async Task CreateAsync(ConfigureGitHubModel model)
        {
            await _db.GetCollection<ConfigureGitHubModel>("ConfigureGitHub").InsertOneAsync(model);
        }

        public async Task<IEnumerable<ConfigureGitHubModel>> GetAllAsync()
        {
            return await _db.GetCollection<ConfigureGitHubModel>("ConfigureGitHub").Find(x => true).ToListAsync();
        }

        public async Task<ConfigureGitHubModel> GetByIdAsync(int id)
        {
            var filter = Builders<ConfigureGitHubModel>.Filter.Eq("Id", id);
            return await _db.GetCollection<ConfigureGitHubModel>("ConfigureGitHub").Find(filter).FirstOrDefaultAsync();
        }

        public async Task UpdateAsync(ConfigureGitHubModel model)
        {
            await _db.GetCollection<ConfigureGitHubModel>("ConfigureGitHub").ReplaceOneAsync(x => x.Id == model.Id, model);
        }

        public async Task DeleteAsync(int id)
        {
            await _db.GetCollection<ConfigureGitHubModel>("ConfigureGitHub").DeleteOneAsync(x => x.Id == id);
        }
    }
}