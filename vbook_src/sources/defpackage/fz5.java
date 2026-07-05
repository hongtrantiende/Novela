package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz5  reason: default package */
/* loaded from: classes3.dex */
public final class fz5 implements x68 {
    public Object a;

    public fz5(Object obj) {
        this.a = obj;
    }

    public void a(ez5 ez5Var) {
        Object obj = this.a;
        if (obj == null) {
            this.a = ez5Var;
        } else if (obj instanceof uv7) {
            ((uv7) obj).a(ez5Var);
        } else if (!obj.equals(ez5Var)) {
            uv7 uv7Var = uz9.a;
            uv7 uv7Var2 = new uv7(2);
            uv7Var2.k((ez5) obj);
            uv7Var2.k(ez5Var);
            this.a = uv7Var2;
        }
    }

    public void b(ez5 ez5Var) {
        Object obj = this.a;
        if (c16.i(obj, ez5Var)) {
            this.a = null;
        } else if (obj instanceof uv7) {
            uv7 uv7Var = (uv7) obj;
            uv7Var.l(ez5Var);
            int i = uv7Var.d;
            if (i != 0) {
                if (i == 1) {
                    Object[] objArr = uv7Var.b;
                    long[] jArr = uv7Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        this.a = objArr[(i2 << 3) + i4];
                                        return;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    p1a.l("The ScatterSet is empty");
                    return;
                }
                return;
            }
            this.a = null;
        }
    }

    @Override // defpackage.x68
    public String m() {
        return "attempted to overwrite the existing value '" + this.a + '\'';
    }
}
