package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c7  reason: default package */
/* loaded from: classes.dex */
public final class c7 {
    public static final c7 c = new c7(new a7[0]);
    public static final a7 d;
    public final int a;
    public final a7[] b;

    static {
        a7 a7Var = new a7(-1, -1, new int[0], new f57[0], new long[0], new String[0], new b7[0]);
        int[] iArr = a7Var.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = a7Var.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f57[] f57VarArr = (f57[]) Arrays.copyOf(a7Var.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(a7Var.g, 0);
        b7[] b7VarArr = a7Var.h;
        d = new a7(0, a7Var.b, copyOf, f57VarArr, copyOf2, strArr, (b7[]) Arrays.copyOf(b7VarArr, Math.max(0, b7VarArr.length)));
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
        a2d.K(4);
    }

    public c7(a7[] a7VarArr) {
        this.a = a7VarArr.length;
        this.b = a7VarArr;
    }

    public final a7 a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c7.class == obj.getClass()) {
                c7 c7Var = (c7) obj;
                if (this.a == c7Var.a && Arrays.equals(this.b, c7Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a7[] a7VarArr = this.b;
            if (i < a7VarArr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                a7VarArr[i].getClass();
                for (int i2 = 0; i2 < a7VarArr[i].e.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = a7VarArr[i].e[i2];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(a7VarArr[i].f[i2]);
                    sb.append(')');
                    if (i2 < a7VarArr[i].e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < a7VarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
