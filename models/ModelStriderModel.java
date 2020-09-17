// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelStriderModel extends EntityModel<Entity> {
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer head;
	private final ModelRenderer bristle1;
	private final ModelRenderer bristle2;
	private final ModelRenderer bristle3;
	private final ModelRenderer bristle4;
	private final ModelRenderer bristle5;
	private final ModelRenderer bristle6;

	public ModelStriderModel() {
		textureWidth = 64;
		textureHeight = 128;

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-4.0F, 8.0F, 0.0F);
		rightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(4.0F, 8.0F, 0.0F);
		leftLeg.setTextureOffset(0, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F, false);

		bristle1 = new ModelRenderer(this);
		bristle1.setRotationPoint(-8.0F, 4.0F, -8.0F);
		head.addChild(bristle1);
		bristle1.setTextureOffset(16, 65).addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		bristle2 = new ModelRenderer(this);
		bristle2.setRotationPoint(-8.0F, -1.0F, -8.0F);
		head.addChild(bristle2);
		bristle2.setTextureOffset(16, 49).addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		bristle3 = new ModelRenderer(this);
		bristle3.setRotationPoint(-8.0F, -5.0F, -8.0F);
		head.addChild(bristle3);
		bristle3.setTextureOffset(16, 33).addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		bristle4 = new ModelRenderer(this);
		bristle4.setRotationPoint(8.0F, -6.0F, -8.0F);
		head.addChild(bristle4);
		bristle4.setTextureOffset(16, 33).addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		bristle5 = new ModelRenderer(this);
		bristle5.setRotationPoint(8.0F, -2.0F, -8.0F);
		head.addChild(bristle5);
		bristle5.setTextureOffset(16, 49).addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		bristle6 = new ModelRenderer(this);
		bristle6.setRotationPoint(8.0F, 3.0F, -8.0F);
		head.addChild(bristle6);
		bristle6.setTextureOffset(16, 65).addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}