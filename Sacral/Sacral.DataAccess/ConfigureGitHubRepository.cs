namespace Sacral
{
    public class ConfigureGitHubRepository 
    {
        //Connection to DynamoDB
        private readonly AmazonDynamoDBClient _client;

        public ConfigureGitHubRepository(AmazonDynamoDBClient client)
        {
            _client = client;
        }

        //Create
        public async Task CreateGitHubRepositoryAsync(ConfigureGitHubModel model)
        {
            var request = new PutItemRequest
            {
                TableName = "Sacral_GitHubRepository",
                Item = new Dictionary<string, AttributeValue>
                {
                    { "Id", new AttributeValue { S = model.Id.ToString() } },
                    { "SacralWebsiteURL", new AttributeValue { S = model.SacralWebsiteURL } },
                    { "ExpertServicesPage", new AttributeValue { S = model.ExpertServicesPage } },
                    { "GitHubUsername", new AttributeValue { S = model.GitHubUsername } },
                    { "GitHubPassword", new AttributeValue { S = model.GitHubPassword } },
                    { "GitHubURL", new AttributeValue { S = model.GitHubURL } },
                    { "GitHubRepositoryName", new AttributeValue { S = model.GitHubRepositoryName } },
                    { "JavaAPIResponse", new AttributeValue { S = model.JavaAPIResponse } },
                    { "Title", new AttributeValue { S = model.Title } },
                    { "UserName", new AttributeValue { S = model.UserName } },
                    { "URL", new AttributeValue { S = model.URL } },
                    { "Action", new AttributeValue { S = model.Action } },
                    { "NumberOfEntries", new AttributeValue { N = model.NumberOfEntries.ToString() } },
                    { "PageNumbers", new AttributeValue { N = model.PageNumbers.ToString() } }
                }
            };

            await _client.PutItemAsync(request);
        }

        //Read
        public async Task<ConfigureGitHubModel> GetGitHubRepositoryByIdAsync(int id)
        {
            var request = new GetItemRequest
            {
                TableName = "Sacral_GitHubRepository",
                Key = new Dictionary<string, AttributeValue>
                {
                    { "Id", new AttributeValue { S = id.ToString() } }
                }
            };

            var response = await _client.GetItemAsync(request);

            if(response.Item == null)
            {
                return null;
            }

            return new ConfigureGitHubModel
            {
                Id = int.Parse(response.Item["Id"].S),
                SacralWebsiteURL = response.Item["SacralWebsiteURL"].S,
                ExpertServicesPage = response.Item["ExpertServicesPage"].S,
                GitHubUsername = response.Item["GitHubUsername"].S,
                GitHubPassword = response.Item["GitHubPassword"].S,
                GitHubURL = response.Item["GitHubURL"].S,
                GitHubRepositoryName = response.Item["GitHubRepositoryName"].S,
                JavaAPIResponse = response.Item["JavaAPIResponse"].S,
                Title = response.Item["Title"].S,
                UserName = response.Item["UserName"].S,
                URL = response.Item["URL"].S,
                Action = response.Item["Action"].S,
                NumberOfEntries = int.Parse(response.Item["NumberOfEntries"].N),
                PageNumbers = int.Parse(response.Item["PageNumbers"].N)
            };
        }

        //Update
        public async Task UpdateGitHubRepositoryAsync(ConfigureGitHubModel model)
        {
            var request = new UpdateItemRequest
            {
                TableName = "Sacral_GitHubRepository",
                Key = new Dictionary<string, AttributeValue>
                {
                    { "Id", new AttributeValue { S = model.Id.ToString() } }
                },
                AttributeUpdates = new Dictionary<string, AttributeValueUpdate>
                {
                    { "SacralWebsiteURL", new Attribute