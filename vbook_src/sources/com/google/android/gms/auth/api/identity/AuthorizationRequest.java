package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AuthorizationRequest extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new go8(24);
    public final String C;
    public final boolean D;
    public final Bundle E;
    public final boolean F;
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        am8.m("requestedScopes cannot be null or empty", z5);
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.C = str3;
        this.D = z3;
        this.E = bundle;
        this.F = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = authorizationRequest.a;
        List list2 = this.a;
        if (list2.size() == list.size() && list2.containsAll(list)) {
            Bundle bundle = authorizationRequest.E;
            Bundle bundle2 = this.E;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!hud.l(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.D == authorizationRequest.D && this.d == authorizationRequest.d && this.F == authorizationRequest.F && hud.l(this.b, authorizationRequest.b) && hud.l(this.e, authorizationRequest.e) && hud.l(this.f, authorizationRequest.f) && hud.l(this.C, authorizationRequest.C)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.D), Boolean.valueOf(this.d), this.e, this.f, this.C, this.E, Boolean.valueOf(this.F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.O(parcel, 5, this.e, i);
        uue.P(parcel, 6, this.f);
        uue.P(parcel, 7, this.C);
        uue.T(parcel, 8, 4);
        parcel.writeInt(this.D ? 1 : 0);
        uue.H(parcel, 9, this.E);
        uue.T(parcel, 10, 4);
        parcel.writeInt(this.F ? 1 : 0);
        uue.V(parcel, U);
    }
}
