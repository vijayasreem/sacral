namespace Sacral.Service
{
    using Sacral.DataAccess;
    using Sacral.DTO;
    using System.Collections.Generic;
    using System.Threading.Tasks;

    public class ConfigureGitHubRepositoryService : IConfigureGitHubRepositoryService
    {
        private readonly IConfigureGitHubRepository _configureGitHubRepository;

        public ConfigureGitHubRepositoryService(IConfigureGitHubRepository configureGitHubRepository)
        {
            _configureGitHubRepository = configureGitHubRepository;
        }

        public async Task CreateAsync(ConfigureGitHubModel model)
        {
            await _configureGitHubRepository.CreateAsync(model);
        }

        public async Task<IEnumerable<ConfigureGitHubModel>> GetAllAsync()
        {
            return await _configureGitHubRepository.GetAllAsync();
        }

        public async Task<ConfigureGitHubModel> GetByIdAsync(int id)
        {
            return await _configureGitHubRepository.GetByIdAsync(id);
        }

        public async Task UpdateAsync(ConfigureGitHubModel model)
        {
            await _configureGitHubRepository.UpdateAsync(model);
        }

        public async Task DeleteAsync(int id)
        {
            await _configureGitHubRepository.DeleteAsync(id);
        }
    }
}