Solution:

from flask import Flask, request

app = Flask(__name__)

@app.route('/validate_policy', methods=['POST'])
def validate_policy():
  data = request.get_json()
  
  # Validate Minimum and Maximum Sum Assured
  min_sum_assured = data.get('min_sum_assured')
  max_sum_assured = data.get('max_sum_assured')
  
  if not (min_sum_assured and max_sum_assured):
    return {'message': 'Missing minimum and maximum sum assured values.'}, 400

  if not (min_sum_assured >= 50 and max_sum_assured <= 20000):
    return {'message': 'Minimum and maximum sum assured must be between 50 and 20000.'}, 400
  
  # Validate Minimum and Maximum Age Limits
  min_age = data.get('min_age')
  max_age = data.get('max_age')
  
  if not (min_age and max_age):
    return {'message': 'Missing minimum and maximum age values.'}, 400

  if not (min_age >= 18 and max_age <= 65):
    return {'message': 'Minimum and maximum age must be between 18 and 65.'}, 400
  
  # Validate Annual Income
  income = data.get('income')
  
  if not income:
    return {'message': 'Missing annual income value.'}, 400

  if income < 40000:
    return {'message': 'Annual income must be greater than or equal to 40000.'}, 400
  
  # Validate Sum Assured Ranges
  sum_assured_ranges = data.get('sum_assured_ranges')
  
  if not sum_assured_ranges:
    return {'message': 'Missing sum assured ranges.'}, 400

  if not (50 in sum_assured_ranges and 10000 in sum_assured_ranges and 15000 in sum_assured_ranges and 20000 in sum_assured_ranges):
    return {'message': 'Sum assured ranges should be 50, 10000, 15000, and 20000.'}, 400
  
  # Validate Policy Tenure Ranges
  tenure_ranges = data.get('tenure_ranges')
  
  if not tenure_ranges:
    return {'message': 'Missing policy tenure ranges.'}, 400

  if not (12 in tenure_ranges and 15 in tenure_ranges and 18 in tenure_ranges and 24 in tenure_ranges):
    return {'message': 'Policy tenure ranges should be 12, 15, 18, and 24.'}, 400
  
  # Validate Spouse Eligibility
  spouse_eligible = data.get('spouse_eligible')
  
  if not spouse_eligible:
    return {'message': 'Missing spouse eligibility value.'}, 400

  if not (spouse_eligible == 'yes' or spouse_eligible == 'no'):
    return {'message': 'Spouse eligibility should be either yes or no.'}, 400
  
  # Validate OTP Authentication
  otp_authenticated = data.get('otp_authenticated')
  
  if not otp_authenticated:
    return {'message': 'Missing OTP authentication value.'}, 400

  if not (otp_authenticated == 'yes' or otp_authenticated == 'no'):
    return {'message': 'OTP authentication should be either yes or no.'}, 400
  
  # Return success message if all validations are successful
  return {'message': 'Policy validation successful.'}, 200