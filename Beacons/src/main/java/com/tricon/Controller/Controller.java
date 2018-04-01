package com.tricon.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tricon.Dao.IBeaconDao;
import com.tricon.IService.IBeaconService;
import com.tricon.vo.BeaconDetails;
@RequestMapping("/sensors/beacons")
public class Controller {
	@Autowired
	private IBeaconDao iBeaconDao;
	
	@Autowired 
	private IBeaconService iBeaconService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void addBeacon(@RequestBody BeaconDetails beacon) {
		iBeaconService.saveBeacon(beacon);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<BeaconDetails>getBeacons()
	{
	List<BeaconDetails> allBeacons=iBeaconDao.findAll();
	
	for(int i=0;i<allBeacons.size();i++) {
		System.out.println(allBeacons.get(i));
	}
	String arg0;
	iBeaconDao.findById(String id)
		System.out.println(.getId());
	
	return allBeacons;
		
	}	

}
