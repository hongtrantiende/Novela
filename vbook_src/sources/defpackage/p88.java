package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p88  reason: default package */
/* loaded from: classes.dex */
public final class p88 implements ku0, nw6, ny, j88, q4d {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int a;
    public int b;
    public Object c;

    public p88(int i, int i2, mn3 mn3Var) {
        this.a = i;
        this.b = i2;
        this.c = new oaa(new cj4(i, i2, mn3Var));
    }

    public static void C(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(dce.j(i2));
    }

    public static boolean x(int i) {
        if (i != 40 && i != 41 && i != 60 && i != 62 && i != 91 && i != 93 && i != 123 && i != 125 && i != 47 && i != 37) {
            return false;
        }
        return true;
    }

    public static boolean y(int i) {
        if (i != 0 && i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            return false;
        }
        return true;
    }

    public int A() {
        int i = this.a;
        if (i < this.b) {
            return ((ljc) this.c).c(i) & 255;
        }
        return -1;
    }

    public void B() {
        int c;
        ljc ljcVar = (ljc) this.c;
        int i = this.b;
        while (true) {
            int i2 = this.a;
            if (i2 < i) {
                int c2 = ljcVar.c(i2) & 255;
                if (y(c2)) {
                    this.a++;
                } else if (c2 == 37) {
                    do {
                        int i3 = this.a;
                        if (i3 < i) {
                            c = ljcVar.c(i3) & 255;
                            this.a++;
                            if (c != 10) {
                            }
                        }
                    } while (c != 13);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public synchronized int D() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) wnd.a(context).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!yz1.o()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.b = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == yz1.o()) {
            i2 = 2;
        }
        this.b = i2;
        return i2;
    }

    public synchronized int E() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = wnd.a((Context) this.c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    @Override // defpackage.ku0
    public int b() {
        return this.a;
    }

    @Override // defpackage.ny
    public void c(int i, Object obj) {
        int i2;
        ny nyVar = (ny) this.c;
        if (this.b == 0) {
            i2 = this.a;
        } else {
            i2 = 0;
        }
        nyVar.c(i + i2, obj);
    }

    @Override // defpackage.j88
    public int d(int i) {
        int d2 = ((j88) this.c).d(i);
        if (i >= 0 && i <= this.b) {
            v3d.c(d2, this.a, i);
        }
        return d2;
    }

    @Override // defpackage.ny
    public void e(Object obj) {
        this.b++;
        ((ny) this.c).e(obj);
    }

    @Override // defpackage.ny
    public void f() {
        ((ny) this.c).f();
    }

    @Override // defpackage.q4d
    public int g() {
        return this.a;
    }

    @Override // defpackage.ny
    public void i(int i, int i2, int i3) {
        int i4;
        if (this.b == 0) {
            i4 = this.a;
        } else {
            i4 = 0;
        }
        ((ny) this.c).i(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ny
    public void j(Object obj, lu4 lu4Var) {
        ((ny) this.c).j(obj, lu4Var);
    }

    @Override // defpackage.ny
    public void k(int i, int i2) {
        int i3;
        ny nyVar = (ny) this.c;
        if (this.b == 0) {
            i3 = this.a;
        } else {
            i3 = 0;
        }
        nyVar.k(i + i3, i2);
    }

    @Override // defpackage.o4d
    public js l(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.c).l(j, jsVar, jsVar2, jsVar3);
    }

    @Override // defpackage.nw6
    public void m(String str) {
        int i;
        str.getClass();
        nw6 nw6Var = (nw6) this.c;
        int i2 = this.a;
        while (str.length() > i2) {
            String substring = str.substring(0, i2);
            int l0 = k4b.l0(substring, '\n', 0, 6);
            if (l0 >= this.b) {
                substring = substring.substring(0, l0);
                i = l0 + 1;
            } else {
                i = i2;
            }
            nw6Var.m(substring);
            str = str.substring(i);
        }
        nw6Var.m(str);
    }

    @Override // defpackage.ny
    public void n() {
        if (this.b <= 0) {
            ex1.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((ny) this.c).n();
    }

    @Override // defpackage.q4d
    public int o() {
        return this.b;
    }

    @Override // defpackage.ny
    public void p(int i, Object obj) {
        int i2;
        ny nyVar = (ny) this.c;
        if (this.b == 0) {
            i2 = this.a;
        } else {
            i2 = 0;
        }
        nyVar.p(i + i2, obj);
    }

    @Override // defpackage.ny
    public Object r() {
        return ((ny) this.c).r();
    }

    @Override // defpackage.ku0
    public int s() {
        return this.b;
    }

    @Override // defpackage.ku0
    public int t() {
        int i = this.a;
        if (i == -1) {
            return ((km8) this.c).D();
        }
        return i;
    }

    @Override // defpackage.o4d
    public js u(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((oaa) this.c).u(j, jsVar, jsVar2, jsVar3);
    }

    @Override // defpackage.j88
    public int w(int i) {
        int w = ((j88) this.c).w(i);
        if (i >= 0 && i <= this.a) {
            v3d.b(w, this.b, i);
        }
        return w;
    }

    public int z(byte b) {
        z1 z1Var = (z1) this.c;
        int i = (((int[]) ((n07) z1Var.d).b)[(b & 255) >> 3] >> ((b & 7) << 2)) & 15;
        int i2 = this.a;
        if (i2 == 0) {
            this.b = ((int[]) z1Var.f)[i];
        }
        int i3 = (i2 * z1Var.b) + i;
        int i4 = (((int[]) ((n07) z1Var.e).b)[i3 >> 3] >> ((i3 & 7) << 2)) & 15;
        this.a = i4;
        return i4;
    }

    public p88(z1 z1Var) {
        z1Var.getClass();
        this.c = z1Var;
    }

    public p88(nw6 nw6Var) {
        this.a = 4000;
        this.b = 3000;
        this.c = nw6Var;
    }

    public p88(j88 j88Var, int i, int i2) {
        this.c = j88Var;
        this.a = i;
        this.b = i2;
    }

    public p88(ljc ljcVar, int i) {
        this.c = ljcVar;
        this.a = i;
        this.b = ljcVar.a;
    }

    public /* synthetic */ p88(int i, Object obj, int i2) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }
}
