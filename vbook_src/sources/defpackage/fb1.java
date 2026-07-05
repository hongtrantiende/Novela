package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb1  reason: default package */
/* loaded from: classes.dex */
public final class fb1 extends eh0 {
    public int[] i;
    public int[] j;

    @Override // defpackage.eh0
    public final v50 a(v50 v50Var) {
        boolean z;
        boolean z2;
        int i = v50Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return v50.e;
        }
        int i2 = v50Var.b;
        if (a2d.M(i)) {
            if (i2 != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 < i2) {
                    if (i4 != i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new x50("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", v50Var);
                }
            }
            if (z) {
                return new v50(v50Var.a, iArr.length, i);
            }
            return v50.e;
        }
        throw new x50(v50Var);
    }

    @Override // defpackage.eh0
    public final void b() {
        this.j = this.i;
    }

    @Override // defpackage.y50
    public final void f(ByteBuffer byteBuffer) {
        int i;
        boolean z;
        int i2;
        int i3;
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i4 : iArr) {
                int t = (a2d.t(this.b.c) * i4) + position;
                int i5 = this.b.c;
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 21) {
                                if (i5 != 22) {
                                    if (i5 != 268435456) {
                                        if (i5 != 1342177280) {
                                            if (i5 != 1610612736) {
                                                if (i5 == 1879048192) {
                                                    l.putDouble(byteBuffer.getDouble(t));
                                                } else {
                                                    p1a.o(this.b.c, "Unexpected encoding: ");
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                l.putInt(byteBuffer.getInt(t));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i = t;
                            } else {
                                i = t + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(t + 1);
                            if (byteBuffer.order() == byteOrder) {
                                t += 2;
                            }
                            int i6 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(t) << 8) & 65280)) >> 8;
                            boolean z2 = true;
                            if ((i6 & (-16777216)) != 0 && (i6 & (-8388608)) != -8388608) {
                                z = false;
                            } else {
                                z = true;
                            }
                            wq9.u(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i6));
                            if (l.remaining() < 3) {
                                z2 = false;
                            }
                            wq9.s(z2);
                            if (l.order() == byteOrder) {
                                i2 = (i6 & 16711680) >> 16;
                            } else {
                                i2 = i6 & 255;
                            }
                            byte b3 = (byte) i2;
                            byte b4 = (byte) ((i6 & 65280) >> 8);
                            if (l.order() == byteOrder) {
                                i3 = i6 & 255;
                            } else {
                                i3 = (i6 & 16711680) >> 16;
                            }
                            l.put(b3).put(b4).put((byte) i3);
                        } else {
                            l.putFloat(byteBuffer.getFloat(t));
                        }
                    } else {
                        l.put(byteBuffer.get(t));
                    }
                }
                l.putShort(byteBuffer.getShort(t));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // defpackage.eh0
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
