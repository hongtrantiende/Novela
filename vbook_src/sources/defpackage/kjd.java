package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kjd  reason: default package */
/* loaded from: classes.dex */
public class kjd extends jjd {
    public kjd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
    }

    @Override // defpackage.qjd
    public tjd a() {
        return tjd.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.ijd, defpackage.qjd
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjd)) {
            return false;
        }
        kjd kjdVar = (kjd) obj;
        if (Objects.equals(this.c, kjdVar.c) && Objects.equals(this.g, kjdVar.g) && ijd.M(this.h, kjdVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qjd
    public bb3 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new bb3(displayCutout);
    }

    @Override // defpackage.qjd
    public int hashCode() {
        return this.c.hashCode();
    }

    public kjd(tjd tjdVar, kjd kjdVar) {
        super(tjdVar, kjdVar);
    }
}
