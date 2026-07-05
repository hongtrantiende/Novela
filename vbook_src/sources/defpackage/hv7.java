package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hv7  reason: default package */
/* loaded from: classes.dex */
public final class hv7 implements ListIterator, j76 {
    public final /* synthetic */ int a;
    public final List b;
    public int c;

    public hv7(int i, List list, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = list;
                this.c = i;
                return;
            default:
                this.b = list;
                this.c = i - 1;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                int i2 = this.c + 1;
                this.c = i2;
                list.add(i2, obj);
                return;
            default:
                list.add(this.c, obj);
                this.c++;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                if (this.c >= list.size() - 1) {
                    return false;
                }
                return true;
            default:
                if (this.c >= list.size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.c > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                int i2 = this.c + 1;
                this.c = i2;
                return list.get(i2);
            default:
                int i3 = this.c;
                this.c = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.c + 1;
            default:
                return this.c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                int i2 = this.c;
                this.c = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.c - 1;
                this.c = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                list.remove(this.c);
                this.c--;
                return;
            default:
                int i2 = this.c - 1;
                this.c = i2;
                list.remove(i2);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                list.set(this.c, obj);
                return;
            default:
                list.set(this.c, obj);
                return;
        }
    }
}
