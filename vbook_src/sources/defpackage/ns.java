package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns  reason: default package */
/* loaded from: classes.dex */
public final class ns implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public ns() {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(String str, int i, int i2, String str2) {
        this.c.add(new ms(i, str, new p3b(str2), i2));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof ps) {
            d((ps) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final void b(int i, int i2, uva uvaVar) {
        this.c.add(new ms(i, i2, 8, uvaVar, null));
    }

    public final void c(pl8 pl8Var, int i, int i2) {
        this.c.add(new ms(i, i2, 8, pl8Var, null));
    }

    public final void d(ps psVar) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(psVar.b);
        List list = psVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                os osVar = (os) list.get(i);
                Object obj = osVar.a;
                this.c.add(new ms(osVar.b + length, osVar.d, obj, osVar.c + length));
            }
        }
    }

    public final void e(ps psVar, int i, int i2) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((CharSequence) psVar.b, i, i2);
        List a = qs.a(psVar, i, i2, null);
        if (a != null) {
            int size = a.size();
            for (int i3 = 0; i3 < size; i3++) {
                os osVar = (os) a.get(i3);
                Object obj = osVar.a;
                this.c.add(new ms(osVar.b + length, osVar.d, obj, osVar.c + length));
            }
        }
    }

    public final void f(String str) {
        this.a.append(str);
    }

    public final void g() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            mv5.c("Nothing to pop.");
        }
        ((ms) a82.h(1, arrayList)).c = this.a.length();
    }

    public final void h(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            int size = arrayList.size();
            mv5.c(i + " should be less than " + size);
        }
        while (arrayList.size() - 1 >= i) {
            g();
        }
    }

    public final int i(String str, String str2) {
        ms msVar = new ms(this.a.length(), 0, 4, new p3b(str2), str);
        ArrayList arrayList = this.b;
        arrayList.add(msVar);
        this.c.add(msVar);
        return arrayList.size() - 1;
    }

    public final int j(uva uvaVar) {
        ms msVar = new ms(this.a.length(), 0, 12, uvaVar, null);
        ArrayList arrayList = this.b;
        arrayList.add(msVar);
        this.c.add(msVar);
        return arrayList.size() - 1;
    }

    public final ps k() {
        StringBuilder sb = this.a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((ms) arrayList.get(i)).a(sb.length()));
        }
        return new ps(sb2, (List) arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof ps) {
            e((ps) charSequence, i, i2);
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public ns(ps psVar) {
        this();
        d(psVar);
    }
}
