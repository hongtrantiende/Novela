package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qac  reason: default package */
/* loaded from: classes.dex */
public final class qac extends eh0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(nae.e);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.eh0
    public final v50 a(v50 v50Var) {
        int i2 = v50Var.c;
        if (!a2d.L(i2) && i2 != 2) {
            throw new x50(v50Var);
        }
        if (i2 != 4) {
            return new v50(v50Var.a, v50Var.b, 4);
        }
        return v50.e;
    }

    @Override // defpackage.y50
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 2) {
            if (i3 != 1342177280) {
                if (i3 != 1610612736) {
                    if (i3 != 1879048192) {
                        if (i3 != 21) {
                            if (i3 == 22) {
                                l = l(i2);
                                while (position < limit) {
                                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l);
                                    position += 4;
                                }
                            } else {
                                vm1.d();
                                return;
                            }
                        } else {
                            l = l((i2 / 3) * 4);
                            while (position < limit) {
                                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l);
                                position += 3;
                            }
                        }
                    } else {
                        l = l(i2 / 2);
                        while (position < limit) {
                            l.putFloat((float) byteBuffer.getDouble(position));
                            position += 8;
                        }
                    }
                } else {
                    l = l(i2);
                    while (position < limit) {
                        m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l);
                        position += 4;
                    }
                }
            } else {
                l = l((i2 / 3) * 4);
                while (position < limit) {
                    m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l);
                    position += 3;
                }
            }
        } else {
            l = l(i2 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l);
                position += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l.flip();
    }
}
