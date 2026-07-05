package com.google.ads.interactivemedia.v3.impl.data.customui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiConfigImpl {
    private m6f adTitle;
    private m6f attribution;
    private m6f authorIcon;
    private m6f authorName;
    private m6f callToAction;
    private m6f icons;
    private m6f skip;
    private m6f videoOverlay;

    public UiConfigImpl(m6f m6fVar, m6f m6fVar2, m6f m6fVar3, m6f m6fVar4, m6f m6fVar5, m6f m6fVar6, m6f m6fVar7, m6f m6fVar8) {
        c6f c6fVar = c6f.a;
        this.videoOverlay = m6fVar;
        this.callToAction = m6fVar2;
        this.attribution = m6fVar3;
        this.skip = m6fVar4;
        this.icons = m6fVar5;
        this.adTitle = m6fVar6;
        this.authorIcon = m6fVar7;
        this.authorName = m6fVar8;
    }

    public static UiConfigImpl createFromJavaScriptMessage(JavaScriptUiConfigData javaScriptUiConfigData) {
        return new UiConfigImpl(m6f.d(javaScriptUiConfigData.videoOverlay()).b(zzc.zza), m6f.d(javaScriptUiConfigData.callToAction()).b(zza.zza), m6f.d(javaScriptUiConfigData.attribution()).b(zze.zza), m6f.d(javaScriptUiConfigData.skip()).b(zzh.zza), m6f.d(javaScriptUiConfigData.icons()).b(zzb.zza), m6f.d(javaScriptUiConfigData.adTitle()).b(zzg.zza), m6f.d(javaScriptUiConfigData.authorIcon()).b(zzd.zza), m6f.d(javaScriptUiConfigData.authorName()).b(zzf.zza));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$createFromJavaScriptMessage$0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UiVastIconImpl.createFromJavaScriptMessage((JavaScriptUiVastIconData) it.next()));
        }
        return arrayList;
    }

    public ruc getAdTitle() {
        return (ruc) this.adTitle.a();
    }

    public quc getAttribution() {
        return (quc) this.attribution.a();
    }

    public ouc getAuthorIcon() {
        return (ouc) this.authorIcon.a();
    }

    public ruc getAuthorName() {
        return (ruc) this.authorName.a();
    }

    public luc getCallToAction() {
        return (luc) this.callToAction.a();
    }

    public List<Object> getIcons() {
        return (List) this.icons.a();
    }

    public suc getSkip() {
        return (suc) this.skip.a();
    }

    public muc getVideoOverlay() {
        return (muc) this.videoOverlay.a();
    }

    public void setAdTitle(ruc rucVar) {
        this.adTitle = m6f.c(rucVar);
    }

    public void setAttribution(quc qucVar) {
        this.attribution = m6f.c(qucVar);
    }

    public void setAuthorIcon(ouc oucVar) {
        this.authorIcon = m6f.c(oucVar);
    }

    public void setAuthorName(ruc rucVar) {
        this.authorName = m6f.c(rucVar);
    }

    public void setCallToAction(luc lucVar) {
        this.callToAction = m6f.c(lucVar);
    }

    public void setIcons(List<Object> list) {
        this.icons = m6f.c(list);
    }

    public void setSkip(suc sucVar) {
        this.skip = m6f.c(sucVar);
    }

    public void setVideoOverlay(muc mucVar) {
        this.videoOverlay = m6f.c(mucVar);
    }
}
