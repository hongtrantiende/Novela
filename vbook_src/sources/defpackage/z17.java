package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z17  reason: default package */
/* loaded from: classes.dex */
public final class z17 extends e2 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public z17(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.v0
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((b27) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.v0, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                String group = ((b27) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(sl1.T(i, this));
        }
    }

    @Override // defpackage.e2, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.e2, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new ss9(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.e2, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.e2, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new ss9(this, 0);
            default:
                return super.listIterator();
        }
    }

    public z17(b27 b27Var) {
        this.b = b27Var;
    }

    @Override // defpackage.e2, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new ss9(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
