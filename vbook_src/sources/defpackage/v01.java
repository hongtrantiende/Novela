package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v01  reason: default package */
/* loaded from: classes3.dex */
public final class v01 implements osa {
    public final /* synthetic */ int a;
    public final ByteBuffer b;
    public final int c;

    public v01(int i, ByteBuffer byteBuffer) {
        this.a = i;
        switch (i) {
            case 1:
                ByteBuffer slice = byteBuffer.slice();
                this.b = slice;
                this.c = slice.capacity();
                return;
            default:
                ByteBuffer slice2 = byteBuffer.slice();
                this.b = slice2;
                this.c = slice2.capacity();
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        int i = this.a;
        int i2 = this.c;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                if (byteBuffer.position() == i2) {
                    return -1L;
                }
                int position = (int) (byteBuffer.position() + j);
                if (position <= i2) {
                    i2 = position;
                }
                byteBuffer.limit(i2);
                return my0Var.write(byteBuffer);
            default:
                my0Var.getClass();
                if (byteBuffer.position() == i2) {
                    return -1L;
                }
                int position2 = (int) (byteBuffer.position() + j);
                if (position2 <= i2) {
                    i2 = position2;
                }
                byteBuffer.limit(i2);
                byteBuffer.getClass();
                return my0Var.write(byteBuffer);
        }
    }

    @Override // defpackage.osa
    public final dac timeout() {
        int i = this.a;
        return dac.d;
    }

    private final void o() {
    }

    private final void q() {
    }
}
