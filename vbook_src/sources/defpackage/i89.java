package defpackage;

import android.opengl.GLES20;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i89  reason: default package */
/* loaded from: classes.dex */
public final class i89 {
    public static final float[] i = {1.0f, nae.e, nae.e, nae.e, -1.0f, nae.e, nae.e, 1.0f, 1.0f};
    public static final float[] j = {1.0f, nae.e, nae.e, nae.e, -0.5f, nae.e, nae.e, 0.5f, 1.0f};
    public static final float[] k = {0.5f, nae.e, nae.e, nae.e, -1.0f, nae.e, nae.e, 1.0f, 1.0f};
    public int a;
    public cw b;
    public ljc c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(h89 h89Var) {
        g89 g89Var = h89Var.a;
        g89 g89Var2 = h89Var.b;
        cw[] cwVarArr = g89Var.a;
        if (cwVarArr.length == 1 && cwVarArr[0].b == 0) {
            cw[] cwVarArr2 = g89Var2.a;
            if (cwVarArr2.length == 1 && cwVarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            ljc ljcVar = new ljc("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = ljcVar;
            this.d = GLES20.glGetUniformLocation(ljcVar.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            this.f = this.c.f("aPosition");
            this.g = this.c.f("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (jy4 e) {
            st0.i("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
