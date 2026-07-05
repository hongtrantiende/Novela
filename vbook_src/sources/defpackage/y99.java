package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y99  reason: default package */
/* loaded from: classes.dex */
public final class y99 extends o3 {
    public static final Parcelable.Creator<y99> CREATOR = new u7e(3);
    public final p70 C;
    public final Integer D;
    public final gcc E;
    public final f40 F;
    public final j70 G;
    public final String H;
    public final ResultReceiver I;
    public final ba9 a;
    public final ea9 b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;

    public y99(ba9 ba9Var, ea9 ea9Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, p70 p70Var, Integer num, gcc gccVar, String str, j70 j70Var, String str2, ResultReceiver resultReceiver) {
        this.I = resultReceiver;
        if (str2 != null) {
            try {
                y99 c = c(new JSONObject(str2));
                this.a = c.a;
                this.b = c.b;
                this.c = c.c;
                this.d = c.d;
                this.e = c.e;
                this.f = c.f;
                this.C = c.C;
                this.D = c.D;
                this.E = c.E;
                this.F = c.F;
                this.G = c.G;
                this.H = str2;
                return;
            } catch (JSONException e) {
                xk5.m(e);
                throw null;
            }
        }
        am8.s(ba9Var);
        this.a = ba9Var;
        am8.s(ea9Var);
        this.b = ea9Var;
        am8.s(bArr);
        this.c = bArr;
        am8.s(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.C = p70Var;
        this.D = num;
        this.E = gccVar;
        if (str != null) {
            try {
                this.F = f40.a(str);
            } catch (e40 e2) {
                xk5.m(e2);
                throw null;
            }
        } else {
            this.F = null;
        }
        this.G = j70Var;
        this.H = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.y99 c(org.json.JSONObject r32) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y99.c(org.json.JSONObject):y99");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof y99)) {
            return false;
        }
        y99 y99Var = (y99) obj;
        List list2 = y99Var.d;
        List list3 = y99Var.f;
        if (hud.l(this.a, y99Var.a) && hud.l(this.b, y99Var.b) && Arrays.equals(this.c, y99Var.c) && hud.l(this.e, y99Var.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && hud.l(this.C, y99Var.C) && hud.l(this.D, y99Var.D) && hud.l(this.E, y99Var.E) && hud.l(this.F, y99Var.F) && hud.l(this.G, y99Var.G) && hud.l(this.H, y99Var.H))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String l = jye.l(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.C);
        String valueOf6 = String.valueOf(this.E);
        String valueOf7 = String.valueOf(this.F);
        String valueOf8 = String.valueOf(this.G);
        StringBuilder y = nk2.y("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        nk2.C(y, l, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        y.append(this.e);
        y.append(", \n excludeList=");
        y.append(valueOf4);
        y.append(", \n authenticatorSelection=");
        y.append(valueOf5);
        y.append(", \n requestId=");
        y.append(this.D);
        y.append(", \n tokenBinding=");
        y.append(valueOf6);
        y.append(", \n attestationConveyancePreference=");
        return nk2.w(y, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 2, this.a, i);
        uue.O(parcel, 3, this.b, i);
        uue.I(parcel, 4, this.c);
        uue.S(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            uue.T(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        uue.S(parcel, 7, this.f);
        uue.O(parcel, 8, this.C, i);
        uue.M(parcel, 9, this.D);
        uue.O(parcel, 10, this.E, i);
        f40 f40Var = this.F;
        if (f40Var == null) {
            str = null;
        } else {
            str = f40Var.a;
        }
        uue.P(parcel, 11, str);
        uue.O(parcel, 12, this.G, i);
        uue.P(parcel, 13, this.H);
        uue.O(parcel, 14, this.I, i);
        uue.V(parcel, U);
    }
}
