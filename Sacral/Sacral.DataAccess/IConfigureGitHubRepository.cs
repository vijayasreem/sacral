namespace Sacral.Service
{
    using Sacral.DTO;
    public interface IConfigureGitHubRepository
    {
        Task CreateAsync(ConfigureGitHubModel model);
        Task<IEnumerable<ConfigureGitHubModel>> GetAllAsync();
        Task<ConfigureGitHubModel> GetByIdAsync(int id);
        Task UpdateAsync(ConfigureGitHubModel model);
        Task DeleteAsync(int id);
    }
}