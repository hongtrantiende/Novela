package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bne  reason: default package */
/* loaded from: classes.dex */
public final class bne extends ftd implements lne {
    public bne(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 4);
    }

    @Override // defpackage.lne
    public final void B(d8f d8fVar, a5f a5fVar, goe goeVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        wbe.b(S, a5fVar);
        wbe.c(S, goeVar);
        T(S, 29);
    }

    @Override // defpackage.lne
    public final void C(d8f d8fVar, x1e x1eVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        wbe.b(S, x1eVar);
        T(S, 30);
    }

    @Override // defpackage.lne
    public final void G(i4e i4eVar, d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, i4eVar);
        wbe.b(S, d8fVar);
        T(S, 12);
    }

    @Override // defpackage.lne
    public final void H(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 27);
    }

    @Override // defpackage.lne
    public final void J(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 6);
    }

    @Override // defpackage.lne
    public final void L(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 26);
    }

    @Override // defpackage.lne
    public final void c(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 4);
    }

    @Override // defpackage.lne
    public final List d(String str, String str2, boolean z, d8f d8fVar) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        ClassLoader classLoader = wbe.a;
        S.writeInt(z ? 1 : 0);
        wbe.b(S, d8fVar);
        Parcel R = R(S, 14);
        ArrayList createTypedArrayList = R.createTypedArrayList(g6f.CREATOR);
        R.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lne
    public final void g(Bundle bundle, d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, bundle);
        wbe.b(S, d8fVar);
        T(S, 19);
    }

    @Override // defpackage.lne
    public final void k(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 25);
    }

    @Override // defpackage.lne
    public final void l(long j, String str, String str2, String str3) {
        Parcel S = S();
        S.writeLong(j);
        S.writeString(str);
        S.writeString(str2);
        S.writeString(str3);
        T(S, 10);
    }

    @Override // defpackage.lne
    public final List n(String str, String str2, String str3) {
        Parcel S = S();
        S.writeString(null);
        S.writeString(str2);
        S.writeString(str3);
        Parcel R = R(S, 17);
        ArrayList createTypedArrayList = R.createTypedArrayList(i4e.CREATOR);
        R.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lne
    public final void o(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 20);
    }

    @Override // defpackage.lne
    public final void p(ibe ibeVar, d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, ibeVar);
        wbe.b(S, d8fVar);
        T(S, 1);
    }

    @Override // defpackage.lne
    public final String q(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        Parcel R = R(S, 11);
        String readString = R.readString();
        R.recycle();
        return readString;
    }

    @Override // defpackage.lne
    public final List r(String str, boolean z, String str2, String str3) {
        Parcel S = S();
        S.writeString(null);
        S.writeString(str2);
        S.writeString(str3);
        ClassLoader classLoader = wbe.a;
        S.writeInt(z ? 1 : 0);
        Parcel R = R(S, 15);
        ArrayList createTypedArrayList = R.createTypedArrayList(g6f.CREATOR);
        R.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lne
    public final List t(String str, String str2, d8f d8fVar) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        wbe.b(S, d8fVar);
        Parcel R = R(S, 16);
        ArrayList createTypedArrayList = R.createTypedArrayList(i4e.CREATOR);
        R.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.lne
    public final h9e u(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        Parcel R = R(S, 21);
        h9e h9eVar = (h9e) wbe.a(R, h9e.CREATOR);
        R.recycle();
        return h9eVar;
    }

    @Override // defpackage.lne
    public final void v(d8f d8fVar, Bundle bundle, wne wneVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        wbe.b(S, bundle);
        wbe.c(S, wneVar);
        T(S, 31);
    }

    @Override // defpackage.lne
    public final byte[] w(String str, ibe ibeVar) {
        Parcel S = S();
        wbe.b(S, ibeVar);
        S.writeString(str);
        Parcel R = R(S, 9);
        byte[] createByteArray = R.createByteArray();
        R.recycle();
        return createByteArray;
    }

    @Override // defpackage.lne
    public final void y(d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, d8fVar);
        T(S, 18);
    }

    @Override // defpackage.lne
    public final void z(g6f g6fVar, d8f d8fVar) {
        Parcel S = S();
        wbe.b(S, g6fVar);
        wbe.b(S, d8fVar);
        T(S, 2);
    }
}
