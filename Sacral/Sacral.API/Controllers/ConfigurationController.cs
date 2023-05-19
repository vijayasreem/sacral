using Sacral.DTO;
using Sacral.Service;
using Microsoft.AspNetCore.Mvc;

namespace Sacral.API
{
    [Route("api/[controller]")]
    [ApiController]
    public class ConfigurationController : ControllerBase
    {
        private readonly IConfigurationService _configurationService;

        public ConfigurationController(IConfigurationService configurationService)
        {
            _configurationService = configurationService;
        }

        [HttpGet]
        public async Task<ActionResult<IEnumerable<ConfigurationDTO>>> GetAsync()
        {
            var configs = await _configurationService.GetAllAsync();
            return Ok(configs);
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<ConfigurationDTO>> GetAsync(int id)
        {
            var config = await _configurationService.GetAsync(id);
            if (config == null)
            {
                return NotFound();
            }

            return Ok(config);
        }

        [HttpPost]
        public async Task<ActionResult<ConfigurationDTO>> PostAsync(ConfigurationDTO configurationDTO)
        {
            var config = await _configurationService.CreateAsync(configurationDTO);
            return CreatedAtAction(nameof(GetAsync), new { id = config.Id }, config);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> PutAsync(int id, ConfigurationDTO configurationDTO)
        {
            if (id != configurationDTO.Id)
            {
                return BadRequest();
            }

            var result = await _configurationService.UpdateAsync(configurationDTO);
            if (result == 0)
            {
                return NotFound();
            }

            return NoContent();
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteAsync(int id)
        {
            var result = await _configurationService.DeleteAsync(id);
            if (result == 0)
            {
                return NotFound();
            }

            return NoContent();
        }
    }
}