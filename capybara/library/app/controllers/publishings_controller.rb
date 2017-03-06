class PublishingsController < ApplicationController
  before_action :set_publishing, only: [:show, :edit, :update, :destroy]

  # GET /publishings
  # GET /publishings.json
  def index
    @publishings = Publishing.all
  end

  # GET /publishings/1
  # GET /publishings/1.json
  def show
  end

  # GET /publishings/new
  def new
    @publishing = Publishing.new
  end

  # GET /publishings/1/edit
  def edit
  end

  # POST /publishings
  # POST /publishings.json
  def create
    @publishing = Publishing.new(publishing_params)

    respond_to do |format|
      if @publishing.save
        format.html { redirect_to @publishing, notice: 'Publishing was successfully created.' }
        format.json { render :show, status: :created, location: @publishing }
      else
        format.html { render :new }
        format.json { render json: @publishing.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /publishings/1
  # PATCH/PUT /publishings/1.json
  def update
    respond_to do |format|
      if @publishing.update(publishing_params)
        format.html { redirect_to @publishing, notice: 'Publishing was successfully updated.' }
        format.json { render :show, status: :ok, location: @publishing }
      else
        format.html { render :edit }
        format.json { render json: @publishing.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /publishings/1
  # DELETE /publishings/1.json
  def destroy
    @publishing.destroy
    respond_to do |format|
      format.html { redirect_to publishings_url, notice: 'Publishing was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_publishing
      @publishing = Publishing.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def publishing_params
      params.require(:publishing).permit(:name)
    end
end
