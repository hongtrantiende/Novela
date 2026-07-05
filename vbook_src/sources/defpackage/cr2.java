package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cr2  reason: default package */
/* loaded from: classes.dex */
public class cr2 extends ny0 {
    public long C;
    public ByteBuffer D;
    public final int E;
    public vq4 c;
    public final nd2 d = new nd2();
    public ByteBuffer e;
    public boolean f;

    static {
        g57.a("media3.decoder");
    }

    public cr2(int i) {
        this.E = i;
    }

    public void n() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.D;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer o(int i) {
        int capacity;
        int i2 = this.E;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(hl5.i(capacity, i, "Buffer too small (", " < ", ")"));
    }

    public final void p(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = o(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer o = o(i2);
        o.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            o.put(byteBuffer);
        }
        this.e = o;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.D;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
