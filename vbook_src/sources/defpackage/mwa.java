package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mwa  reason: default package */
/* loaded from: classes.dex */
public final class mwa implements GLSurfaceView.Renderer, hf8 {
    public final zz9 a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ nwa k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public mwa(nwa nwaVar, zz9 zz9Var) {
        this.k = nwaVar;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = zz9Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // defpackage.hf8
    public final synchronized void a(float f, float[] fArr) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), nae.e);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object g;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        zz9 zz9Var = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(16384);
        try {
            xoe.g();
        } catch (jy4 e) {
            st0.i("SceneRenderer", "Failed to draw a frame", e);
        }
        if (zz9Var.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = zz9Var.F;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                xoe.g();
            } catch (jy4 e2) {
                st0.i("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (zz9Var.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(zz9Var.C, 0);
            }
            long timestamp = zz9Var.F.getTimestamp();
            cw cwVar = zz9Var.e;
            synchronized (cwVar) {
                g = cwVar.g(false, timestamp);
            }
            Long l = (Long) g;
            if (l != null) {
                o40 o40Var = zz9Var.d;
                float[] fArr3 = zz9Var.C;
                float[] fArr4 = (float[]) ((cw) o40Var.d).j(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) o40Var.c;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != nae.e) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!o40Var.a) {
                        o40.c((float[]) o40Var.b, (float[]) o40Var.c);
                        o40Var.a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) o40Var.b, 0, (float[]) o40Var.c, 0);
                }
            }
            h89 h89Var = (h89) zz9Var.f.j(timestamp);
            if (h89Var != null) {
                i89 i89Var = zz9Var.c;
                i89Var.getClass();
                if (i89.b(h89Var)) {
                    i89Var.a = h89Var.c;
                    i89Var.b = new cw(h89Var.a.a[0]);
                    if (!h89Var.d) {
                        cw cwVar2 = h89Var.b.a[0];
                        float[] fArr6 = (float[]) cwVar2.d;
                        int length2 = fArr6.length;
                        xoe.i(fArr6);
                        xoe.i((float[]) cwVar2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(zz9Var.D, 0, fArr2, 0, zz9Var.C, 0);
        i89 i89Var2 = zz9Var.c;
        int i = zz9Var.E;
        float[] fArr7 = zz9Var.D;
        cw cwVar3 = i89Var2.b;
        if (cwVar3 != null) {
            int i2 = i89Var2.a;
            if (i2 == 1) {
                fArr = i89.j;
            } else if (i2 == 2) {
                fArr = i89.k;
            } else {
                fArr = i89.i;
            }
            GLES20.glUniformMatrix3fv(i89Var2.e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(i89Var2.d, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(i89Var2.h, 0);
            try {
                xoe.g();
            } catch (jy4 e3) {
                st0.i("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(i89Var2.f, 3, 5126, false, 12, (Buffer) ((FloatBuffer) cwVar3.d));
            try {
                xoe.g();
            } catch (jy4 e4) {
                st0.i("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(i89Var2.g, 2, 5126, false, 8, (Buffer) ((FloatBuffer) cwVar3.e));
            try {
                xoe.g();
            } catch (jy4 e5) {
                st0.i("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(cwVar3.c, 0, cwVar3.b);
            try {
                xoe.g();
            } catch (jy4 e6) {
                st0.i("ProjectionRenderer", "Failed to render", e6);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.b, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nwa nwaVar = this.k;
        nwaVar.e.post(new ex2(25, nwaVar, this.a.d()));
    }
}
