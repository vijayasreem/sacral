using Microsoft.AspNetCore.Mvc;
using Sacral.DTO;
using Sacral.Service;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Sacral.API
{
    [Route("api/[controller]")]
    [ApiController]
    public class JiraToNetController : ControllerBase
    {
        private readonly JiraToNetService _jiraToNetService;

        public JiraToNetController(JiraToNetService jiraToNetService)
        {
            _jiraToNetService = jiraToNetService;
        }

        [HttpGet]
        public async Task<ActionResult<IEnumerable<JiraToNetModel>>> GetAllAsync()
        {
            var models = await _jiraToNetService.GetAllAsync();
            return Ok(models);
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<JiraToNetModel>> GetByIdAsync(int id)
        {
            var model = await _jiraToNetService.GetByIdAsync(id);
            return Ok(model);
        }

        [HttpPost]
        public async Task<ActionResult<JiraToNetModel>> CreateAsync([FromBody]JiraToNetModel model)
        {
            var newModel = await _jiraToNetService.CreateAsync(model);
            return Ok(newModel);
        }

        [HttpPut]
        public async Task<ActionResult<JiraToNetModel>> UpdateAsync([FromBody]JiraToNetModel model)
        {
            var updatedModel = await _jiraToNetService.UpdateAsync(model);
            return Ok(updatedModel);
        }

        [HttpDelete("{id}")]
        public async Task<ActionResult> DeleteAsync(int id)
        {
            await _jiraToNetService.DeleteAsync(id);
            return NoContent();
        }
    }
}