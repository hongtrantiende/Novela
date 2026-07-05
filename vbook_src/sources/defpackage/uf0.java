package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uf0  reason: default package */
/* loaded from: classes.dex */
public final class uf0 implements es4 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final hs4 q;
    public boolean r;
    public int s;

    public uf0(hs4 hs4Var) {
        hs4Var.H();
        tr4 tr4Var = hs4Var.w;
        if (tr4Var != null) {
            tr4Var.d.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = hs4Var;
    }

    @Override // defpackage.es4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            this.q.d.add(this);
            return true;
        }
        return true;
    }

    public final void b(qs4 qs4Var) {
        this.a.add(qs4Var);
        qs4Var.d = this.b;
        qs4Var.e = this.c;
        qs4Var.f = this.d;
        qs4Var.g = this.e;
    }

    public final void c(int i) {
        qs4 qs4Var;
        if (this.g) {
            if (hs4.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rr4 rr4Var = ((qs4) arrayList.get(i2)).b;
                if (rr4Var != null) {
                    rr4Var.O += i;
                    if (hs4.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + qs4Var.b + " to " + qs4Var.b.O);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            qs4 qs4Var = (qs4) arrayList.get(size);
            if (qs4Var.c) {
                if (qs4Var.a == 8) {
                    qs4Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = qs4Var.b.U;
                    qs4Var.a = 2;
                    qs4Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        qs4 qs4Var2 = (qs4) arrayList.get(i2);
                        if (qs4Var2.c && qs4Var2.b.U == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (!this.r) {
            if (hs4.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new iw6());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z3 = this.g;
            hs4 hs4Var = this.q;
            if (z3) {
                this.s = hs4Var.k.getAndIncrement();
            } else {
                this.s = -1;
            }
            if (z2) {
                hs4Var.y(this, z);
            }
            return this.s;
        }
        vs.k("commit already called");
        return 0;
    }

    public final void f(int i, rr4 rr4Var, String str) {
        String str2 = rr4Var.h0;
        if (str2 != null) {
            ps4.c(rr4Var, str2);
        }
        Class<?> cls = rr4Var.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = rr4Var.V;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(rr4Var);
                    sb.append(": was ");
                    vs.k(nk2.v(sb, rr4Var.V, " now ", str));
                    return;
                }
                rr4Var.V = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i2 = rr4Var.T;
                    if (i2 != 0 && i2 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(rr4Var);
                        int i3 = rr4Var.T;
                        sb2.append(": was ");
                        sb2.append(i3);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    rr4Var.T = i;
                    rr4Var.U = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + rr4Var + " with tag " + str + " to container view with no id");
                }
            }
            b(new qs4(1, rr4Var));
            rr4Var.P = this.q;
            return;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException("Fragment " + canonicalName + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qs4 qs4Var = (qs4) arrayList.get(i);
                switch (qs4Var.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + qs4Var.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(qs4Var.b);
                if (z) {
                    if (qs4Var.d != 0 || qs4Var.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(qs4Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(qs4Var.e));
                    }
                    if (qs4Var.f != 0 || qs4Var.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(qs4Var.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(qs4Var.g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Token.CASE);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
