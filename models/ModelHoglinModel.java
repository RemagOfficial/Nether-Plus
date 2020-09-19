// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelHoglinModel extends EntityModel<Entity> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer BackHair;
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Tusk;
	private final ModelRenderer Tusk2;
	private final ModelRenderer Ear1;
	private final ModelRenderer Ear2;

	public ModelHoglinModel() {
		textureWidth = 128;
		textureHeight = 64;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 24.0F, 15.0F);
		leg1.setTextureOffset(0, 45).addBox(-7.0F, -11.0F, 0.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 24.0F, -23.0F);
		leg2.setTextureOffset(21, 45).addBox(2.0F, -11.0F, 38.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 24.0F, -23.0F);
		leg3.setTextureOffset(41, 42).addBox(-7.0F, -14.0F, 19.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-10.0F, 24.0F, 5.0F);
		leg4.setTextureOffset(66, 42).addBox(11.0F, -14.0F, -9.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		BackHair = new ModelRenderer(this);
		BackHair.setRotationPoint(0.5F, -6.0F, 5.0F);
		setRotationAngle(BackHair, 0.0F, -1.5708F, 0.0F);
		BackHair.setTextureOffset(90, 48).addBox(-9.5F, -7.0F, 0.4F, 19.0F, 14.0F, 0.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-10.0F, 24.0F, -24.0F);
		Body.setTextureOffset(1, 1).addBox(2.0F, -23.0F, 19.0F, 16.0F, 14.0F, 26.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 11.0F, -10.5F);
		setRotationAngle(Head, 0.7994F, 0.0F, 0.0F);
		Head.setTextureOffset(61, 1).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 6.0F, 19.0F, 0.0F, false);

		Tusk = new ModelRenderer(this);
		Tusk.setRotationPoint(-8.0F, 10.5F, -14.0F);
		setRotationAngle(Tusk, 0.7994F, 0.0F, 0.0F);
		Tusk.setTextureOffset(1, 13).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Tusk2 = new ModelRenderer(this);
		Tusk2.setRotationPoint(8.0F, 10.5F, -14.0F);
		setRotationAngle(Tusk2, 0.7994F, 0.0F, 0.0F);
		Tusk2.setTextureOffset(10, 13).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Ear1 = new ModelRenderer(this);
		Ear1.setRotationPoint(-8.0F, 7.5F, -8.0F);
		setRotationAngle(Ear1, 0.6109F, 0.6685F, -0.829F);
		Ear1.setTextureOffset(1, 1).addBox(-3.5807F, -0.3849F, -0.4064F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		Ear2 = new ModelRenderer(this);
		Ear2.setRotationPoint(8.25F, 6.9205F, -6.4944F);
		setRotationAngle(Ear2, 0.6109F, -0.6685F, 0.829F);
		Ear2.setTextureOffset(1, 6).addBox(-3.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		BackHair.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Tusk.render(matrixStack, buffer, packedLight, packedOverlay);
		Tusk2.render(matrixStack, buffer, packedLight, packedOverlay);
		Ear1.render(matrixStack, buffer, packedLight, packedOverlay);
		Ear2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}