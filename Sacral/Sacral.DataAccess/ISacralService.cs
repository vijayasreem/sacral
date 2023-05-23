using Sacral.DTO;

namespace Sacral.Service
{
    public interface ISacralService
    {
        IEnumerable<SacralDTO> GetSacrals();
    }
}