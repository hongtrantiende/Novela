package defpackage;

import android.text.Layout;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: apc  reason: default package */
/* loaded from: classes.dex */
public final class apc {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public dqb r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(apc apcVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (apcVar != null) {
            if (!this.c && apcVar.c) {
                this.b = apcVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = apcVar.h;
            }
            if (this.i == -1) {
                this.i = apcVar.i;
            }
            if (this.a == null && (str = apcVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = apcVar.f;
            }
            if (this.g == -1) {
                this.g = apcVar.g;
            }
            if (this.n == -1) {
                this.n = apcVar.n;
            }
            if (this.o == null && (alignment2 = apcVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = apcVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = apcVar.q;
            }
            if (this.j == -1) {
                this.j = apcVar.j;
                this.k = apcVar.k;
            }
            if (this.r == null) {
                this.r = apcVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = apcVar.s;
            }
            if (this.t == null) {
                this.t = apcVar.t;
            }
            if (this.u == null) {
                this.u = apcVar.u;
            }
            if (!this.e && apcVar.e) {
                this.d = apcVar.d;
                this.e = true;
            }
            if (this.m == -1 && (i = apcVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
