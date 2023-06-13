using System;
using Sacral.DataAccess;
using Sacral.DTO;

namespace Sacral.Service
{
    public interface ISacralService
    {
        Task PerformSacralServiceAsync();
    }
}