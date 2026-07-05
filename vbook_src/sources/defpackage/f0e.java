package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f0e  reason: default package */
/* loaded from: classes.dex */
public final class f0e extends o3 implements xzc {
    public static final Parcelable.Creator<f0e> CREATOR = new rwd(20);
    public String C;
    public Boolean D;
    public y1e E;
    public boolean F;
    public hde G;
    public qbe H;
    public List I;
    public p4e a;
    public skf b;
    public String c;
    public String d;
    public ArrayList e;
    public ArrayList f;

    public f0e(qf4 qf4Var, ArrayList arrayList) {
        am8.s(qf4Var);
        qf4Var.a();
        this.c = qf4Var.b;
        this.d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.C = "2";
        e(arrayList);
    }

    @Override // defpackage.xzc
    public final String a() {
        return this.b.b;
    }

    public final String c() {
        String str;
        Map map;
        p4e p4eVar = this.a;
        if (p4eVar != null && (str = p4eVar.b) != null && (map = (Map) gbe.a(str).b.get("firebase")) != null) {
            return (String) map.get("tenant");
        }
        return null;
    }

    public final boolean d() {
        String str;
        Boolean bool = this.D;
        if (bool == null || bool.booleanValue()) {
            p4e p4eVar = this.a;
            if (p4eVar != null) {
                Map map = (Map) gbe.a(p4eVar.b).b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z = true;
            if (this.e.size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.D = Boolean.valueOf(z);
        }
        return this.D.booleanValue();
    }

    public final synchronized void e(ArrayList arrayList) {
        try {
            am8.s(arrayList);
            this.e = new ArrayList(arrayList.size());
            this.f = new ArrayList(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                xzc xzcVar = (xzc) arrayList.get(i);
                if (xzcVar.a().equals("firebase")) {
                    this.b = (skf) xzcVar;
                } else {
                    this.f.add(xzcVar.a());
                }
                this.e.add((skf) xzcVar);
            }
            if (this.b == null) {
                this.b = (skf) this.e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(ArrayList arrayList) {
        qbe qbeVar;
        if (arrayList.isEmpty()) {
            qbeVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                et7 et7Var = (et7) obj;
                if (et7Var instanceof su8) {
                    arrayList2.add((su8) et7Var);
                } else if (et7Var instanceof iic) {
                    arrayList3.add((iic) et7Var);
                }
            }
            qbeVar = new qbe(arrayList2, arrayList3);
        }
        this.H = qbeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.O(parcel, 2, this.b, i);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.S(parcel, 5, this.e);
        uue.Q(parcel, 6, this.f);
        uue.P(parcel, 7, this.C);
        uue.G(parcel, 8, Boolean.valueOf(d()));
        uue.O(parcel, 9, this.E, i);
        boolean z = this.F;
        uue.T(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        uue.O(parcel, 11, this.G, i);
        uue.O(parcel, 12, this.H, i);
        uue.S(parcel, 13, this.I);
        uue.V(parcel, U);
    }
}
