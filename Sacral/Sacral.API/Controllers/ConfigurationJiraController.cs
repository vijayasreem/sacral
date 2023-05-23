using Microsoft.AspNetCore.Mvc;
using Sacral.DTO;
using Sacral.Service;

namespace Sacral.API
{
    [Route("api/[controller]")]
    [ApiController]
    public class ConfigurationJiraController : ControllerBase
    {
        private readonly ConfigurationJiraService configurationJiraService;

        public ConfigurationJiraController(ConfigurationJiraService configurationJiraService)
        {
            this.configurationJiraService = configurationJiraService;
        }

        [HttpPost]
        public async Task<ActionResult<SacralResultDTO>> ConfigureJiraAsync()
        {
            try
            {
                await configurationJiraService.ConfigureJiraAsync();
                return Ok(new SacralResultDTO { 
                    Success = true, 
                    Message = "Jira configuration successful"
                });
            }
            catch (Exception ex)
            {
                return BadRequest(new SacralResultDTO
                {
                    Success = false,
                    Message = $"Error configuring Jira: {ex.Message}"
                });
            }
        }
    }
}