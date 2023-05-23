namespace Sacral.Service
{
    using Sacral.DataAccess;
    using Sacral.DTO;
    using System.Collections.Generic;
    using System.Threading.Tasks;

    public interface IConfigureGitHubRepositoryService
    {
        Task CreateAsync(ConfigureGitHubModel model);
        Task<IEnumerable<ConfigureGitHubModel>> GetAllAsync();
        Task<ConfigureGitHubModel> GetByIdAsync(int id);
        Task UpdateAsync(ConfigureGitHubModel model);
        Task DeleteAsync(int id);
    }
}

using Sacral.Service;
using Sacral.DTO;