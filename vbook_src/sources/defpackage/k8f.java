package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k8f  reason: default package */
/* loaded from: classes.dex */
public final class k8f {
    public Object[] a;
    public int b;
    public i8f c;

    public k8f(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 >= 0) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int highestOneBit = Integer.highestOneBit(i2 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                this.a = Arrays.copyOf(objArr, length);
                return;
            }
            vs.m("cannot store more than Integer.MAX_VALUE elements");
        }
    }

    public k8f() {
        this(4);
    }
}
