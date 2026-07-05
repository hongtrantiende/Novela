package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x01  reason: default package */
/* loaded from: classes3.dex */
public final class x01 extends ow2 {
    public final int C;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x01(int i) {
        super(2048);
        this.f = i;
        this.C = 4098;
    }

    @Override // defpackage.ow2
    public final void G(Object obj) {
        int i = this.f;
        int i2 = this.C;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                if (byteBuffer.capacity() == i2) {
                    if (byteBuffer.isDirect()) {
                        vs.k("Check failed.");
                        return;
                    }
                    return;
                }
                vs.k("Check failed.");
                return;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.getClass();
                if (byteBuffer2.capacity() == i2) {
                    if (!byteBuffer2.isDirect()) {
                        vs.k("Check failed.");
                        return;
                    }
                    return;
                }
                vs.k("Check failed.");
                return;
        }
    }

    @Override // defpackage.ow2
    public final Object o(Object obj) {
        switch (this.f) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.clear();
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.clear();
                byteBuffer2.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer2;
        }
    }

    @Override // defpackage.ow2
    public final Object q() {
        int i = this.f;
        int i2 = this.C;
        switch (i) {
            case 0:
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                allocate.getClass();
                return allocate;
            default:
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
                allocateDirect.getClass();
                return allocateDirect;
        }
    }
}
