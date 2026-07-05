package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fw1  reason: default package */
/* loaded from: classes.dex */
public final class fw1 extends fs9 implements lu4 {
    public final /* synthetic */ gw1 C;
    public int b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw1(gw1 gw1Var, m42 m42Var) {
        super(2, m42Var);
        this.C = gw1Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        fw1 fw1Var = new fw1(this.C, m42Var);
        fw1Var.f = obj;
        return fw1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((fw1) create((c9a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        c9a c9aVar;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        gw1 gw1Var = this.C;
        kv7 kv7Var = gw1Var.a;
        vu7 vu7Var = gw1Var.c;
        int i6 = this.e;
        if (i6 != 0) {
            if (i6 == 1) {
                i = this.d;
                i2 = this.c;
                i3 = this.b;
                c9aVar = (c9a) this.f;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            c9aVar = (c9a) this.f;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (i3 < Math.min(gw1Var.d + 10, vu7Var.b)) {
            int i7 = i3 + 1;
            int c = vu7Var.c(i3);
            switch (c) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    i2++;
                    str = rs8.i(kv7Var.f(i2), "down ");
                    break;
                case 2:
                    str = rs8.k("remove ", vu7Var.c(i7), vu7Var.c(i3 + 2), " ");
                    i7 = i3 + 3;
                    break;
                case 3:
                    int c2 = vu7Var.c(i7);
                    int c3 = vu7Var.c(i3 + 2);
                    int c4 = vu7Var.c(i3 + 3);
                    StringBuilder r = hl5.r(c2, c3, "move ", " ", " ");
                    r.append(c4);
                    str = r.toString();
                    i7 = i3 + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    i4 = i3 + 2;
                    int c5 = vu7Var.c(i7);
                    i5 = i2 + 1;
                    str2 = "insertBottomUp " + c5 + " " + kv7Var.f(i2);
                    int i8 = i4;
                    str = str2;
                    i7 = i8;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i3 + 2;
                    int c6 = vu7Var.c(i7);
                    i5 = i2 + 1;
                    str2 = "insertTopDown " + c6 + " " + kv7Var.f(i2);
                    int i82 = i4;
                    str = str2;
                    i7 = i82;
                    i2 = i5;
                    break;
                case 7:
                    Object f = kv7Var.f(i2);
                    f.getClass();
                    jsc.u(2, f);
                    i2 += 2;
                    str = "apply " + ((lu4) f);
                    break;
                case 8:
                    str = rs8.i(gw1Var.b.f(i), "reuse ");
                    i++;
                    break;
                case 9:
                    str = "recompose pending";
                    break;
                default:
                    str = a82.j(c, "unknown op: ");
                    break;
            }
            this.f = c9aVar;
            this.b = i7;
            this.c = i2;
            this.d = i;
            this.e = 1;
            c9aVar.c(this, i3 + ": " + str);
            return n82.a;
        }
        return pvc.a;
    }
}
