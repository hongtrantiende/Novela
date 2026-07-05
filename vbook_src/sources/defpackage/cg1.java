package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cg1  reason: default package */
/* loaded from: classes3.dex */
public final class cg1 {
    public final String A;
    public final int B;
    public final fa7 C;
    public final List D;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final j62 e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final List y;
    public final Set z;

    public cg1(boolean z, boolean z2, boolean z3, boolean z4, j62 j62Var, List list, String str, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list2, Set set, String str5, int i, fa7 fa7Var, List list3) {
        list.getClass();
        list2.getClass();
        set.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = j62Var;
        this.f = list;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = str4;
        this.r = z12;
        this.s = z13;
        this.t = z14;
        this.u = z15;
        this.v = z16;
        this.w = z17;
        this.x = z18;
        this.y = list2;
        this.z = set;
        this.A = str5;
        this.B = i;
        this.C = fa7Var;
        this.D = list3;
    }

    public static cg1 a(cg1 cg1Var, boolean z, boolean z2, boolean z3, boolean z4, j62 j62Var, List list, String str, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list2, Set set, String str5, int i, fa7 fa7Var, List list3, int i2) {
        boolean z19 = (i2 & 1) != 0 ? cg1Var.a : z;
        boolean z20 = (i2 & 2) != 0 ? cg1Var.b : z2;
        boolean z21 = (i2 & 4) != 0 ? cg1Var.c : z3;
        boolean z22 = (i2 & 8) != 0 ? cg1Var.d : z4;
        j62 j62Var2 = (i2 & 16) != 0 ? cg1Var.e : j62Var;
        List list4 = (i2 & 32) != 0 ? cg1Var.f : list;
        String str6 = (i2 & 64) != 0 ? cg1Var.g : str;
        String str7 = (i2 & Token.CASE) != 0 ? cg1Var.h : str2;
        String str8 = (i2 & 256) != 0 ? cg1Var.i : str3;
        boolean z23 = (i2 & 512) != 0 ? cg1Var.j : z5;
        boolean z24 = (i2 & 1024) != 0 ? cg1Var.k : z6;
        boolean z25 = (i2 & 2048) != 0 ? cg1Var.l : z7;
        boolean z26 = (i2 & 4096) != 0 ? cg1Var.m : z8;
        cg1Var.getClass();
        boolean z27 = (i2 & 16384) != 0 ? cg1Var.n : z9;
        boolean z28 = (i2 & 32768) != 0 ? cg1Var.o : z10;
        boolean z29 = (i2 & Parser.ARGC_LIMIT) != 0 ? cg1Var.p : z11;
        String str9 = (i2 & 131072) != 0 ? cg1Var.q : str4;
        boolean z30 = (i2 & 262144) != 0 ? cg1Var.r : z12;
        boolean z31 = (i2 & 524288) != 0 ? cg1Var.s : z13;
        boolean z32 = (i2 & 1048576) != 0 ? cg1Var.t : z14;
        boolean z33 = (i2 & 2097152) != 0 ? cg1Var.u : z15;
        boolean z34 = (i2 & 4194304) != 0 ? cg1Var.v : z16;
        boolean z35 = (i2 & 8388608) != 0 ? cg1Var.w : z17;
        boolean z36 = (i2 & 16777216) != 0 ? cg1Var.x : z18;
        List list5 = (i2 & 33554432) != 0 ? cg1Var.y : list2;
        Set set2 = (i2 & 67108864) != 0 ? cg1Var.z : set;
        String str10 = (i2 & 134217728) != 0 ? cg1Var.A : str5;
        int i3 = (i2 & 268435456) != 0 ? cg1Var.B : i;
        fa7 fa7Var2 = (i2 & 536870912) != 0 ? cg1Var.C : fa7Var;
        List list6 = (i2 & 1073741824) != 0 ? cg1Var.D : list3;
        cg1Var.getClass();
        list4.getClass();
        str7.getClass();
        list5.getClass();
        set2.getClass();
        str10.getClass();
        list6.getClass();
        return new cg1(z19, z20, z21, z22, j62Var2, list4, str6, str7, str8, z23, z24, z25, z26, z27, z28, z29, str9, z30, z31, z32, z33, z34, z35, z36, list5, set2, str10, i3, fa7Var2, list6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cg1) {
                cg1 cg1Var = (cg1) obj;
                if (this.a != cg1Var.a || this.b != cg1Var.b || this.c != cg1Var.c || this.d != cg1Var.d || !c16.i(this.e, cg1Var.e) || !c16.i(this.f, cg1Var.f) || !this.g.equals(cg1Var.g) || !this.h.equals(cg1Var.h) || !this.i.equals(cg1Var.i) || this.j != cg1Var.j || this.k != cg1Var.k || this.l != cg1Var.l || this.m != cg1Var.m || this.n != cg1Var.n || this.o != cg1Var.o || this.p != cg1Var.p || !this.q.equals(cg1Var.q) || this.r != cg1Var.r || this.s != cg1Var.s || this.t != cg1Var.t || this.u != cg1Var.u || this.v != cg1Var.v || this.w != cg1Var.w || this.x != cg1Var.x || !c16.i(this.y, cg1Var.y) || !c16.i(this.z, cg1Var.z) || !this.A.equals(cg1Var.A) || this.B != cg1Var.B || !c16.i(this.C, cg1Var.C) || !c16.i(this.D, cg1Var.D)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = 0;
        j62 j62Var = this.e;
        if (j62Var == null) {
            hashCode = 0;
        } else {
            hashCode = j62Var.hashCode();
        }
        int a = hl5.a(this.B, eub.j(s21.b(this.z, eub.l(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(eub.j(eub.j(eub.l((k + hashCode) * 31, this.f, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, false), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), this.y, 31), 31), 31, this.A), 31);
        fa7 fa7Var = this.C;
        if (fa7Var != null) {
            i = fa7Var.hashCode();
        }
        return this.D.hashCode() + ((a + i) * 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ChatState(isLoading=", this.a, ", isLoadingMore=", this.b, ", isError=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", conversation=");
        p.append(this.e);
        p.append(", conversationMembers=");
        p.append(this.f);
        p.append(", currentUserId=");
        nk2.C(p, this.g, ", groupName=", this.h, ", groupAvatar=");
        rs8.y(p, this.i, ", isDirectConversation=", this.j, ", isPublic=");
        rs8.z(p, this.k, ", isJoined=", this.l, ", isJoining=");
        rs8.z(p, this.m, ", isBlocked=false, isLogin=", this.n, ", canSendMessages=");
        rs8.z(p, this.o, ", isAppAdmin=", this.p, ", myMemberRole=");
        rs8.y(p, this.q, ", canManageConversation=", this.r, ", canInviteMembers=");
        rs8.z(p, this.s, ", canKickMembers=", this.t, ", canLeaveConversation=");
        rs8.z(p, this.u, ", isActionLoading=", this.v, ", isInviteLoading=");
        rs8.z(p, this.w, ", hasMoreInviteUsers=", this.x, ", inviteUsers=");
        p.append(this.y);
        p.append(", selectedInviteUserIds=");
        p.append(this.z);
        p.append(", memberActionUserId=");
        a82.u(this.B, this.A, ", newMessageCount=", ", quote=", p);
        p.append(this.C);
        p.append(", messageList=");
        p.append(this.D);
        p.append(")");
        return p.toString();
    }
}
