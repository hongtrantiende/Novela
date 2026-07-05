package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq7  reason: default package */
/* loaded from: classes.dex */
public abstract class mq7 implements f03 {
    public s78 C;
    public i38 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public hg I;
    public boolean J;
    public m41 b;
    public int c;
    public mq7 e;
    public mq7 f;
    public mq7 a = this;
    public int d = -1;

    public void C1() {
        if (!this.J) {
            lv5.c("reset() called on an unattached node");
        }
        B1();
    }

    public void D1() {
        if (!this.J) {
            lv5.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.G) {
            lv5.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.G = false;
        z1();
        this.H = true;
    }

    public void E1() {
        if (!this.J) {
            lv5.c("node detached multiple times");
        }
        if (this.D == null) {
            lv5.c("detach invoked on a node without a coordinator");
        }
        if (!this.H) {
            lv5.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.H = false;
        hg hgVar = this.I;
        if (hgVar != null) {
            hgVar.invoke();
        }
        A1();
    }

    public void F1(mq7 mq7Var) {
        this.a = mq7Var;
    }

    public void G1(i38 i38Var) {
        this.D = i38Var;
    }

    public final m82 v1() {
        m41 m41Var = this.b;
        if (m41Var == null) {
            m41 a = k27.a(((rg) voe.w(this)).getCoroutineContext().plus(new y26((w26) ((rg) voe.w(this)).getCoroutineContext().get(r0f.I))));
            this.b = a;
            return a;
        }
        return m41Var;
    }

    public boolean w1() {
        return !(this instanceof lg0);
    }

    public void x1() {
        if (this.J) {
            lv5.c("node attached multiple times");
        }
        if (this.D == null) {
            lv5.c("attach invoked on a node without a coordinator");
        }
        this.J = true;
        this.G = true;
    }

    public void y1() {
        if (!this.J) {
            lv5.c("Cannot detach a node that is not attached");
        }
        if (this.G) {
            lv5.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.H) {
            lv5.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.J = false;
        m41 m41Var = this.b;
        if (m41Var != null) {
            k27.n(m41Var, new nx8("The Modifier.Node was detached", 2));
            this.b = null;
        }
    }

    public void A1() {
    }

    public void B1() {
    }

    public void z1() {
    }
}
