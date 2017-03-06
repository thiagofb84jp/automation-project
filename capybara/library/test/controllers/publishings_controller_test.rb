require 'test_helper'

class PublishingsControllerTest < ActionDispatch::IntegrationTest
  setup do
    @publishing = publishings(:one)
  end

  test "should get index" do
    get publishings_url
    assert_response :success
  end

  test "should get new" do
    get new_publishing_url
    assert_response :success
  end

  test "should create publishing" do
    assert_difference('Publishing.count') do
      post publishings_url, params: { publishing: { name: @publishing.name } }
    end

    assert_redirected_to publishing_url(Publishing.last)
  end

  test "should show publishing" do
    get publishing_url(@publishing)
    assert_response :success
  end

  test "should get edit" do
    get edit_publishing_url(@publishing)
    assert_response :success
  end

  test "should update publishing" do
    patch publishing_url(@publishing), params: { publishing: { name: @publishing.name } }
    assert_redirected_to publishing_url(@publishing)
  end

  test "should destroy publishing" do
    assert_difference('Publishing.count', -1) do
      delete publishing_url(@publishing)
    end

    assert_redirected_to publishings_url
  end
end
