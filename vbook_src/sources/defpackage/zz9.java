package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz9  reason: default package */
/* loaded from: classes.dex */
public final class zz9 implements o8d, v51 {
    public int E;
    public SurfaceTexture F;
    public byte[] I;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final i89 c = new Object();
    public final o40 d = new o40(3, false);
    public final cw e = new cw(6, (byte) 0);
    public final cw f = new cw(6, (byte) 0);
    public final float[] C = new float[16];
    public final float[] D = new float[16];
    public volatile int G = 0;
    public int H = -1;

    @Override // defpackage.v51
    public final void a(long j, float[] fArr) {
        ((cw) this.d.d).a(fArr, j);
    }

    @Override // defpackage.v51
    public final void b() {
        this.e.c();
        o40 o40Var = this.d;
        ((cw) o40Var.d).c();
        o40Var.a = false;
        this.b.set(true);
    }

    @Override // defpackage.o8d
    public final void c(long j, long j2, vq4 vq4Var, MediaFormat mediaFormat) {
        int i;
        float f;
        ArrayList arrayList;
        int m;
        this.e.a(Long.valueOf(j), j2);
        byte[] bArr = vq4Var.C;
        int i2 = vq4Var.D;
        byte[] bArr2 = this.I;
        int i3 = this.H;
        this.I = bArr;
        if (i2 == -1) {
            i2 = this.G;
        }
        this.H = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.I)) {
            return;
        }
        byte[] bArr3 = this.I;
        h89 h89Var = null;
        if (bArr3 != null) {
            int i4 = this.H;
            km8 km8Var = new km8(bArr3);
            try {
                km8Var.N(4);
                m = km8Var.m();
                km8Var.M(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (m == 1886547818) {
                km8Var.N(8);
                int i5 = km8Var.b;
                int i6 = km8Var.c;
                while (i5 < i6) {
                    int m2 = km8Var.m() + i5;
                    if (m2 <= i5 || m2 > i6) {
                        break;
                    }
                    int m3 = km8Var.m();
                    if (m3 != 2037673328 && m3 != 1836279920) {
                        km8Var.M(m2);
                        i5 = m2;
                    }
                    km8Var.L(m2);
                    arrayList = yae.B(km8Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = yae.B(km8Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 1) {
                    if (size == 2) {
                        h89Var = new h89((g89) arrayList.get(0), (g89) arrayList.get(1), i4);
                    }
                } else {
                    g89 g89Var = (g89) arrayList.get(0);
                    h89Var = new h89(g89Var, g89Var, i4);
                }
            }
        }
        if (h89Var == null || !i89.b(h89Var)) {
            int i7 = this.H;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f2 = radians / 36.0f;
            float f3 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f4 = radians / 2.0f;
                float f5 = (i10 * f2) - f4;
                i = i10 + 1;
                float f6 = (i * f2) - f4;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        if (i13 == 0) {
                            f = f5;
                        } else {
                            f = f6;
                        }
                        float f7 = radians;
                        float f8 = i11 * f3;
                        float f9 = radians2;
                        double d = (f8 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = f;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f10 = f2;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f8 / f9;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f10) / f7;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f7;
                        f2 = f10;
                        radians2 = f9;
                    }
                    i11++;
                    i = i12;
                }
            }
            g89 g89Var2 = new g89(new cw(0, 1, fArr, fArr2));
            h89Var = new h89(g89Var2, g89Var2, i7);
        }
        this.f.a(h89Var, j2);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            xoe.g();
            this.c.a();
            xoe.g();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            xoe.g();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            xoe.g();
            GLES20.glTexParameteri(36197, 10240, 9729);
            xoe.g();
            GLES20.glTexParameteri(36197, 10241, 9729);
            xoe.g();
            GLES20.glTexParameteri(36197, 10242, 33071);
            xoe.g();
            GLES20.glTexParameteri(36197, 10243, 33071);
            xoe.g();
            this.E = i;
        } catch (jy4 e) {
            st0.i("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.E);
        this.F = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: yz9
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                zz9.this.a.set(true);
            }
        });
        return this.F;
    }
}
