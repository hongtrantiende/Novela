package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mu8  reason: default package */
/* loaded from: classes.dex */
public final class mu8 extends f2 {
    public final ku8 c;
    public int d;
    public ync e;
    public int f;

    public mu8(ku8 ku8Var, int i) {
        super(i, ku8Var.D);
        this.c = ku8Var;
        this.d = ku8Var.e();
        this.f = -1;
        b();
    }

    public final void a() {
        if (this.d == this.c.e()) {
            return;
        }
        vs.f();
    }

    @Override // defpackage.f2, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.a;
        ku8 ku8Var = this.c;
        ku8Var.add(i, obj);
        this.a++;
        this.b = ku8Var.a();
        this.d = ku8Var.e();
        this.f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        ku8 ku8Var = this.c;
        Object[] objArr = ku8Var.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (ku8Var.D - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ku8Var.d / 5) + 1;
        ync yncVar = this.e;
        if (yncVar == null) {
            this.e = new ync(objArr, i2, i, i3);
            return;
        }
        yncVar.a = i2;
        yncVar.b = i;
        yncVar.c = i3;
        if (yncVar.d.length < i3) {
            yncVar.d = new Object[i3];
        }
        ?? r0 = 0;
        yncVar.d[0] = objArr;
        if (i2 == i) {
            r0 = 1;
        }
        yncVar.e = r0;
        yncVar.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.a;
            this.f = i;
            ync yncVar = this.e;
            ku8 ku8Var = this.c;
            if (yncVar == null) {
                Object[] objArr = ku8Var.C;
                this.a = i + 1;
                return objArr[i];
            } else if (yncVar.hasNext()) {
                this.a++;
                return yncVar.next();
            } else {
                Object[] objArr2 = ku8Var.C;
                int i2 = this.a;
                this.a = i2 + 1;
                return objArr2[i2 - yncVar.b];
            }
        }
        xk5.g();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.a;
            this.f = i - 1;
            ync yncVar = this.e;
            ku8 ku8Var = this.c;
            if (yncVar == null) {
                Object[] objArr = ku8Var.C;
                int i2 = i - 1;
                this.a = i2;
                return objArr[i2];
            }
            int i3 = yncVar.b;
            if (i > i3) {
                Object[] objArr2 = ku8Var.C;
                int i4 = i - 1;
                this.a = i4;
                return objArr2[i4 - i3];
            }
            this.a = i - 1;
            return yncVar.previous();
        }
        xk5.g();
        return null;
    }

    @Override // defpackage.f2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f;
        if (i != -1) {
            ku8 ku8Var = this.c;
            ku8Var.b(i);
            int i2 = this.f;
            if (i2 < this.a) {
                this.a = i2;
            }
            this.b = ku8Var.a();
            this.d = ku8Var.e();
            this.f = -1;
            b();
            return;
        }
        vm1.d();
    }

    @Override // defpackage.f2, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f;
        if (i != -1) {
            ku8 ku8Var = this.c;
            ku8Var.set(i, obj);
            this.d = ku8Var.e();
            b();
            return;
        }
        vm1.d();
    }
}
