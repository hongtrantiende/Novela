package defpackage;

import android.media.MediaFormat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d04  reason: default package */
/* loaded from: classes.dex */
public final class d04 implements o8d, v51, b09 {
    public o8d a;
    public v51 b;
    public o8d c;
    public v51 d;

    @Override // defpackage.v51
    public final void a(long j, float[] fArr) {
        v51 v51Var = this.d;
        if (v51Var != null) {
            v51Var.a(j, fArr);
        }
        v51 v51Var2 = this.b;
        if (v51Var2 != null) {
            v51Var2.a(j, fArr);
        }
    }

    @Override // defpackage.v51
    public final void b() {
        v51 v51Var = this.d;
        if (v51Var != null) {
            v51Var.b();
        }
        v51 v51Var2 = this.b;
        if (v51Var2 != null) {
            v51Var2.b();
        }
    }

    @Override // defpackage.o8d
    public final void c(long j, long j2, vq4 vq4Var, MediaFormat mediaFormat) {
        o8d o8dVar = this.c;
        if (o8dVar != null) {
            o8dVar.c(j, j2, vq4Var, mediaFormat);
        }
        o8d o8dVar2 = this.a;
        if (o8dVar2 != null) {
            o8dVar2.c(j, j2, vq4Var, mediaFormat);
        }
    }

    @Override // defpackage.b09
    public final void d(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i != 10000) {
                    return;
                }
                nwa nwaVar = (nwa) obj;
                if (nwaVar == null) {
                    this.c = null;
                    this.d = null;
                    return;
                }
                this.c = nwaVar.getVideoFrameMetadataListener();
                this.d = nwaVar.getCameraMotionListener();
                return;
            }
            this.b = (v51) obj;
            return;
        }
        this.a = (o8d) obj;
    }
}
