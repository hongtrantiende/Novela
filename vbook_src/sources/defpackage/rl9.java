package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rl9  reason: default package */
/* loaded from: classes.dex */
public abstract class rl9 {
    public static final List s = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int i;
    public RecyclerView q;
    public yk9 r;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public rl9 g = null;
    public rl9 h = null;
    public final ArrayList j = null;
    public final List k = null;
    public int l = 0;
    public kl9 m = null;
    public boolean n = false;
    public int o = 0;
    public int p = -1;

    public rl9(View view) {
        if (view != null) {
            this.a = view;
        } else {
            vs.m("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.i = i | this.i;
    }

    public final int b() {
        int i = this.f;
        if (i == -1) {
            return this.c;
        }
        return i;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.i & 1024) == 0 && (arrayList = this.j) != null && arrayList.size() != 0) {
            return this.k;
        }
        return s;
    }

    public final boolean d() {
        if ((this.i & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((this.i & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.i & 16) == 0) {
            Field field = rcd.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g() {
        if ((this.i & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.i & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.f == -1) {
            this.f = this.c;
        }
        if (z) {
            this.f += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((fl9) view.getLayoutParams()).c = true;
        }
    }

    public final void l() {
        this.i = 0;
        this.c = -1;
        this.d = -1;
        this.f = -1;
        this.l = 0;
        this.g = null;
        this.h = null;
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.i &= -1025;
        this.o = 0;
        this.p = -1;
        RecyclerView.g(this);
    }

    public final void m(boolean z) {
        int i;
        int i2 = this.l;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.l = i;
        if (i < 0) {
            this.l = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i == 1) {
            this.i |= 16;
        } else if (z && i == 0) {
            this.i &= -17;
        }
    }

    public final boolean n() {
        if ((this.i & Token.CASE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if ((this.i & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=-1, oldPos=" + this.d + ", pLpos:" + this.f);
        if (h()) {
            sb.append(" scrap ");
            if (this.n) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (e()) {
            sb.append(" invalid");
        }
        if (!d()) {
            sb.append(" unbound");
        }
        if ((this.i & 2) != 0) {
            sb.append(" update");
        }
        if (g()) {
            sb.append(" removed");
        }
        if (n()) {
            sb.append(" ignored");
        }
        if (i()) {
            sb.append(" tmpDetached");
        }
        if (!f()) {
            sb.append(" not recyclable(" + this.l + ")");
        }
        if ((this.i & 512) != 0 || e()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
