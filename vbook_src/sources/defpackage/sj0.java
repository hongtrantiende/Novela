package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sj0  reason: default package */
/* loaded from: classes.dex */
public final class sj0 extends cr2 {
    public long F;
    public int G;
    public int H;

    @Override // defpackage.cr2
    public final void n() {
        super.n();
        this.G = 0;
    }

    public final boolean r(cr2 cr2Var) {
        ByteBuffer byteBuffer;
        wq9.s(!cr2Var.h(1073741824));
        wq9.s(!cr2Var.h(268435456));
        wq9.s(!cr2Var.h(4));
        if (s()) {
            if (this.G < this.H) {
                ByteBuffer byteBuffer2 = cr2Var.e;
                if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.G;
        this.G = i + 1;
        if (i == 0) {
            this.C = cr2Var.C;
            if (cr2Var.h(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = cr2Var.e;
        if (byteBuffer3 != null) {
            p(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.F = cr2Var.C;
        return true;
    }

    public final boolean s() {
        if (this.G > 0) {
            return true;
        }
        return false;
    }
}
