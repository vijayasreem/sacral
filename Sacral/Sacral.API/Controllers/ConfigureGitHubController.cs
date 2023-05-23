namespace Sacral.API
{
    using Microsoft.AspNetCore.Mvc;
    using Sacral.DTO;
    using Sacral.Service;
    using System.Collections.Generic;
    using System.Threading.Tasks;

    [ApiController]
    public class ConfigureGitHubController : ControllerBase
    {
        private readonly ConfigureGitHubRepositoryService _configureGitHubRepositoryService;

        public ConfigureGitHubController(ConfigureGitHubRepositoryService configureGitHubRepositoryService)
        {
            _configureGitHubRepositoryService = configureGitHubRepositoryService;
        }

        [HttpPost]
        public async Task<IActionResult> CreateAsync([FromBody] ConfigureGitHubModel model)
        {
            await _configureGitHubRepositoryService.CreateAsync(model);

            return Ok();
        }

        [HttpGet]
        public async Task<IActionResult> GetAllAsync()
        {
            var response = await _configureGitHubRepositoryService.GetAllAsync();

            return Ok(response);
        }

        [HttpGet]
        public async Task<IActionResult> GetByIdAsync(int id)
        {
            var response = await _configureGitHubRepositoryService.GetByIdAsync(id);

            return Ok(response);
        }

        [HttpPut]
        public async Task<IActionResult> UpdateAsync([FromBody] ConfigureGitHubModel model)
        {
            await _configureGitHubRepositoryService.UpdateAsync(model);

            return Ok();
        }

        [HttpDelete]
        public async Task<IActionResult> DeleteAsync(int id)
        {
            await _configureGitHubRepositoryService.DeleteAsync(id);

            return Ok();
        }
    }
}