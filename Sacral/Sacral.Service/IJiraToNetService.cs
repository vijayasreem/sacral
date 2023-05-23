using System.Threading.Tasks;
using Sacral.DataAccess;
using Sacral.DTO;

namespace Sacral.Service
{
    public interface IJiraToNetService
    {
        Task<JiraToNetModel> GetByIdAsync(int id);
        Task<IEnumerable<JiraToNetModel>> GetAllAsync();
        Task<JiraToNetModel> CreateAsync(JiraToNetModel model);
        Task<JiraToNetModel> UpdateAsync(JiraToNetModel model);
        Task DeleteAsync(int id);
    }
}