package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public final class ak implements Iterator, j76 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public ak(Iterator it, int i) {
        this.a = i;
        it.getClass();
        switch (i) {
            case 3:
                this.b = new ArrayList();
                this.c = it;
                return;
            default:
                this.b = it;
                return;
        }
    }

    public lo8 a() {
        jo8 jo8Var;
        float[] fArr;
        float f;
        float[] fArr2 = (float[]) this.b;
        if (fArr2.length < 8) {
            return mo8.a;
        }
        st6 st6Var = (st6) this.c;
        st6Var.getClass();
        int C = a82.C(((kn8) st6Var.b).b(fArr2));
        jo8 jo8Var2 = jo8.d;
        jo8 jo8Var3 = jo8.f;
        jo8 jo8Var4 = jo8.C;
        switch (C) {
            case 0:
                jo8Var = jo8.a;
                break;
            case 1:
                jo8Var = jo8.b;
                break;
            case 2:
                jo8Var = jo8.c;
                break;
            case 3:
                jo8Var = jo8Var2;
                break;
            case 4:
                jo8Var = jo8.e;
                break;
            case 5:
                jo8Var = jo8Var3;
                break;
            case 6:
                jo8Var = jo8Var4;
                break;
            default:
                xk5.o();
                return null;
        }
        if (jo8Var == jo8Var4) {
            return mo8.a;
        }
        if (jo8Var == jo8Var3) {
            return mo8.b;
        }
        int ordinal = jo8Var.ordinal();
        if (ordinal == 0) {
            fArr = new float[]{fArr2[0], fArr2[1]};
        } else if (ordinal == 1) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]};
        } else if (ordinal == 2) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
        } else if (ordinal != 3) {
            fArr = ordinal != 4 ? new float[0] : new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]};
        } else {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
        }
        if (jo8Var == jo8Var2) {
            f = fArr2[6];
        } else {
            f = nae.e;
        }
        return new lo8(jo8Var, fArr, f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((kn8) ((st6) this.c).b).a();
            case 1:
                return ((Iterator) this.b).hasNext();
            case 2:
                return ((Iterator) this.b).hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return a();
            case 1:
                Object next = ((Iterator) obj).next();
                this.c = next;
                next.getClass();
                return next;
            case 2:
                return ((xt4) ((ki4) this.c).b).invoke(((Iterator) obj).next());
            default:
                Object next2 = ((Iterator) this.c).next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next2;
                view.getClass();
                b2 b2Var = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    b2Var = new b2(viewGroup, 10);
                }
                if (b2Var != null && b2Var.hasNext()) {
                    arrayList.add((Iterator) this.c);
                    this.c = b2Var;
                } else {
                    while (!((Iterator) this.c).hasNext() && !arrayList.isEmpty()) {
                        this.c = (Iterator) sl1.j0(arrayList);
                        xl1.R(arrayList);
                    }
                }
                return next2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        y28 y28Var;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((Iterator) this.b).remove();
                Object obj = this.c;
                if (obj instanceof y28) {
                    if (obj instanceof y28) {
                        y28Var = (y28) obj;
                    } else {
                        y28Var = null;
                    }
                    if (y28Var != null) {
                        y28Var.D();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ak(yj yjVar) {
        this.a = 0;
        this.b = new float[8];
        this.c = new st6(yjVar.a, 2);
    }

    public ak(ki4 ki4Var) {
        this.a = 2;
        this.c = ki4Var;
        this.b = ((b9a) ki4Var.c).iterator();
    }
}
