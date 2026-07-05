package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ol0  reason: default package */
/* loaded from: classes.dex */
public final class ol0 extends mla {
    public final Context n;
    public final int o;

    public ol0(Context context) {
        super(new cr2[1], new nl0[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.mla
    public final cr2 g() {
        return new cr2(1);
    }

    @Override // defpackage.mla
    public final dr2 h() {
        return new nl0(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ab2, java.lang.Exception] */
    @Override // defpackage.mla
    public final ab2 i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ab2, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ab2, java.lang.Exception] */
    @Override // defpackage.mla
    public final ab2 j(cr2 cr2Var, dr2 dr2Var, boolean z) {
        boolean z2;
        nl0 nl0Var = (nl0) dr2Var;
        ByteBuffer byteBuffer = cr2Var.e;
        byteBuffer.getClass();
        wq9.D(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.s(z2);
        try {
            int i = this.o;
            if (i == -1) {
                Context context = this.n;
                if (context != null) {
                    Point x = a2d.x(context);
                    int i2 = x.x;
                    int i3 = x.y;
                    vq4 vq4Var = cr2Var.c;
                    if (vq4Var != null) {
                        int i4 = vq4Var.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = vq4Var.O;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            nl0Var.e = bze.j(byteBuffer.array(), byteBuffer.remaining(), i);
            nl0Var.c = cr2Var.C;
            return null;
        } catch (xm8 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }
}
