package me.Fupery.ArtMap.api;

import java.io.File;
import java.io.Reader;

import org.bukkit.plugin.Plugin;

import me.Fupery.ArtMap.api.Painting.IArtistHandler;
import me.Fupery.ArtMap.api.Utils.VersionHandler;

public interface IArtMap extends Plugin {

	IArtistHandler getArtistHandler();
	VersionHandler getBukkitVersion();
	Reader getTextResourceFile(String fileName);
	boolean writeResource(String resourcePath, File destination);

}

