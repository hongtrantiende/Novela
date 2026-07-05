package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l9e  reason: default package */
/* loaded from: classes.dex */
public final class l9e implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ l9e(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((p9e) this.c).a.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.b < ((p9e) this.c).a.length()) {
                    return true;
                }
                return false;
            default:
                if (this.b < ((w0e) this.c).i()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((p9e) obj).a;
                int i2 = this.b;
                if (i2 < str.length()) {
                    this.b = i2 + 1;
                    return new p9e(String.valueOf(i2));
                }
                xk5.g();
                return null;
            case 1:
                p9e p9eVar = (p9e) obj;
                String str2 = p9eVar.a;
                int i3 = this.b;
                if (i3 < str2.length()) {
                    this.b = i3 + 1;
                    return new p9e(String.valueOf(p9eVar.a.charAt(i3)));
                }
                xk5.g();
                return null;
            default:
                w0e w0eVar = (w0e) obj;
                int i4 = this.b;
                int i5 = w0eVar.i();
                int i6 = this.b;
                if (i4 < i5) {
                    this.b = i6 + 1;
                    return w0eVar.j(i6);
                }
                p1a.l(nk2.s(i6, "Out of bounds index: ", new StringBuilder(String.valueOf(i6).length() + 21)));
                return null;
        }
    }
}
