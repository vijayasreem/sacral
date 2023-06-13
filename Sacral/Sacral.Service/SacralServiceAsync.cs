using System;
using System.Threading.Tasks;
using Sacral.DataAccess;
using Sacral.DTO;

namespace Sacral.Service
{
    public class SacralServiceAsync : ISacralService
    {
        private readonly SalesforceService _salesforceService;

        public SacralServiceAsync(SalesforceService salesforceService)
        {
            _salesforceService = salesforceService;
        }

        public async Task PerformSacralServiceAsync()
        {
            Console.WriteLine("Performing Sacral Service...");

            var records = await _salesforceService.GetAllRecordsAsync();

            foreach (var record in records)
            {
                // Perform any business logic necessary
            }
        }

        public async Task<SacralDTO> GetSacralDataAsync()
        {
            var sacralData = await _salesforceService.GetSacralDataAsync();
            return sacralData;
        }
    }
}