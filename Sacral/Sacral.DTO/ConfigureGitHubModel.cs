namespace Sacral
{
    public class ConfigureGitHubModel
    {
        public int Id { get; set; }
        public string Username { get; set; }
        public string Password { get; set; } 
        public string URL { get; set; }
        public string RepositoryName { get; set; } 
        public string Title { get; set; }
        public string Action { get; set; }
        public int NoOfEntries { get; set; }
    }
}