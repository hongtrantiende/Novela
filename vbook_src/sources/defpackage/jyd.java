package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jyd  reason: default package */
/* loaded from: classes.dex */
public final class jyd implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ AbstractSet c;

    public /* synthetic */ jyd(AbstractSet abstractSet, int i) {
        this.a = i;
        this.c = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                kyd kydVar = (kyd) abstractSet;
                if (this.b >= kydVar.b() - kydVar.a()) {
                    return false;
                }
                return true;
            default:
                if (this.b >= ((klf) ((tz) abstractSet).b).e) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractSet abstractSet = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                kyd kydVar = (kyd) abstractSet;
                if (i2 < kydVar.b() - kydVar.a()) {
                    lyd lydVar = kydVar.b;
                    Object obj = lydVar.a[kydVar.a() + i2];
                    this.b = i2 + 1;
                    return obj;
                }
                xk5.g();
                return null;
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                klf klfVar = (klf) ((tz) abstractSet).b;
                return klfVar.d(klfVar.d[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
