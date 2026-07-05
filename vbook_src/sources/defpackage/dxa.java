package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dxa  reason: default package */
/* loaded from: classes.dex */
public final class dxa implements Iterable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public dxa(b6f b6fVar, List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                uu5 uu5Var = (uu5) obj;
                return ((exa) uu5Var.d).a(uu5Var, (CharSequence) obj2);
            default:
                return new fzd(((List) obj2).iterator(), ((List) obj).iterator());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                lie lieVar = new lie(", ", 2);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                lieVar.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public dxa(uu5 uu5Var, CharSequence charSequence) {
        this.b = charSequence;
        this.c = uu5Var;
    }
}
